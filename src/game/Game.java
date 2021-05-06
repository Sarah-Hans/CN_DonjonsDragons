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
        while (choix.equals("jouer") && casePlayer1 < 12) {
           newTurn();
        }
    }
    //nouveau lancé de dé
    public void newTurn() {
        int exceed;
        Dice lanceDe = new Dice();
        chiffreDe = lanceDe.lancerDe();
        System.out.println("Tu as obtenu : " + chiffreDe);
        board.set(casePlayer1, contentSquare);
        casePlayer1 = casePlayer1 + chiffreDe;
        System.out.println(casePlayer1+1);
        try {
            if (casePlayer1 > 11) {
                throw new PersonnageHorsPlateauException("Vous avez dépassé le plateau !");
            }
            if (casePlayer1 == 11) {
                win();
            }
            contentSquare = board.get(casePlayer1);
            board.set(casePlayer1, player1);
            System.out.println(board);
            System.out.println(player1Name + " tu es sur la case " + (casePlayer1+1) + ". Cette case contenait "+ contentSquare);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());
            exceed = casePlayer1 - 11;
            casePlayer1 = 11 - exceed;
            if (casePlayer1 == 11) {
                win();
            }
            contentSquare = board.get(casePlayer1);
            board.set(casePlayer1, player1);
            System.out.println(board);
            System.out.println(player1Name + " tu es sur la case " + (casePlayer1+1) + ". Cette case contenait "+ contentSquare);
        }
        System.out.println("Lance le dé pour jouer... (tape jouer)");
        choix = clavier.nextLine();
    }
    public void win() {
        System.out.println("Case 12. Bravo, tu as gagné!");
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
}


