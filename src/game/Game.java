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
        String whatHappend;
        System.out.println("C'est parti !");
        board = gameBoard.getGameBoard();
        contentSquare = board.get(0);
        whatHappend = contentSquare.interaction(player1);
        board.set(0, player1);
        casePlayer1 = board.indexOf(player1);
        System.out.println(player1Name + " tu es sur la case " + (casePlayer1 +1) + ". Cette case contenait "+ contentSquare);
        System.out.println(whatHappend);
        System.out.println("Lance le dé pour jouer... (tape jouer)");
        choix = clavier.nextLine();
        while (choix.equals("jouer") && casePlayer1 < 12) {
           newTurn();
        }
    }
    //nouveau lancé de dé
    public void newTurn() {
        String whatHappend;
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
            whatHappend = contentSquare.interaction(player1);
            board.set(casePlayer1, player1);
            System.out.println(board);
            System.out.println(player1Name + " tu es sur la case " + (casePlayer1+1) + ". Cette case contenait "+ contentSquare);
            System.out.println(whatHappend);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());
            exceed = casePlayer1 - 11;
            casePlayer1 = 11 - exceed;
            if (casePlayer1 == 11) {
                win();
            }
            contentSquare = board.get(casePlayer1);
            whatHappend = contentSquare.interaction(player1);
            board.set(casePlayer1, player1);
            System.out.println(player1Name + " tu es sur la case " + (casePlayer1+1) + ". Cette case contenait "+ contentSquare);
            System.out.println(whatHappend);

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

    public Board getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    public ArrayList<Square> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Square> board) {
        this.board = board;
    }

    public int getCasePlayer1() {
        return casePlayer1;
    }

    public void setCasePlayer1(int casePlayer1) {
        this.casePlayer1 = casePlayer1;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public int getChiffreDe() {
        return chiffreDe;
    }

    public void setChiffreDe(int chiffreDe) {
        this.chiffreDe = chiffreDe;
    }

    public Character getPlayer1() {
        return player1;
    }

    public void setPlayer1(Character player1) {
        this.player1 = player1;
    }

    public Scanner getClavier() {
        return clavier;
    }

    public void setClavier(Scanner clavier) {
        this.clavier = clavier;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public Square getContentSquare() {
        return contentSquare;
    }

    public void setContentSquare(Square contentSquare) {
        this.contentSquare = contentSquare;
    }
}


