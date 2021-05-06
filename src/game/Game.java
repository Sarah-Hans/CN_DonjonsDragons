package game;

import exceptions.PersonnageHorsPlateauException;
import menu.Menu;
import characters.Character;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    // attributs doivent caractériser le game
    private Board gameBoard;
    private ArrayList<Square> board;
    private int casePlayer1;
    private String player1Name;
    private int chiffreDe;
    private Character player1;
    private Scanner clavier;
    private String choix;
    private Square contentSquare;

    //constructeur : intitialiser les attributs
    public Game(Character player) {
        gameBoard = new Board(board);
        board = gameBoard.getGameBoard();
        player1 = player;
        player1Name = player.getName();
        casePlayer1 = 0;
        chiffreDe = 0;
        contentSquare = null;
        this.clavier = new Scanner(System.in);
        choix = null;
    }

    public void startGame()  {
        System.out.println("C'est parti !");
        board = gameBoard.getGameBoard();
        contentSquare = board.get(0);
        board.set(0, player1);
        casePlayer1 = board.indexOf(player1);
        System.out.println(board);
        System.out.println(player1Name + " tu es sur la case " + (casePlayer1 +1) + ". Cette case contenait "+ contentSquare);
        System.out.println("Lance le dé pour jouer... (tape jouer)");
        choix = clavier.nextLine();
        while (choix.equals("jouer") && casePlayer1 < 4) {
           newTurn();
        }
    }
    //nouveau lancé de dé
    public void newTurn() {
        Dice lanceDe = new Dice();
        chiffreDe = lanceDe.lancerDe();
        System.out.println("Tu as obtenu : " + chiffreDe);
        board.set(0, contentSquare);
        try {
            if (casePlayer1 > 3) {
                throw new PersonnageHorsPlateauException("Vous avez dépassé le plateau !");
            }
            casePlayer1 = casePlayer1 + chiffreDe;
        } catch (PersonnageHorsPlateauException e) {
            casePlayer1 = 3;
        }
        if (casePlayer1 == 3) {
            System.out.println("Case 4. Bravo, tu as gagné!");
            System.out.println("1 - Recommencer une partie");
            System.out.println("2 - Quitter le jeu");
            choix = clavier.nextLine();
            if (choix.equals("1")) {
                Menu mainMenu = new Menu();
                mainMenu.startMenu();
            } else {
                System.out.println("Bye bye");
                System.exit(0);
            }
        }
        contentSquare = board.get(casePlayer1);
        board.set(casePlayer1, player1);
        System.out.println(board);
        System.out.println(player1Name + " tu es sur la case " + (casePlayer1+1) + ". Cette case contenait "+ contentSquare);
        System.out.println("Lance le dé pour jouer... (tape jouer)");
        choix = clavier.nextLine();
    }
}


