package game;

import exceptions.PersonnageHorsPlateauException;
import menu.Menu;
import characters.Character;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * <b>Gestion du jeu</b>
 * <p>Classe qui lance une partie et gère les tours de jeu.
 * Le jeu nécessite :
 * <ul>
 *     <li>Un plateau de jeu</li>
 *     <li>Un joueur</li>
 *     <li>Un dé</li>
 * </ul>
 * Une méthode startGame() lance le jeu
 * Une méthode newTurn() qui boucle à chaque lancement de dé
 * Une méthode qui lance une interaction avec la case en cours
 * Une méthode qui gère quand le joueur gagne la partie
 * </p>
 *
 * @see Board
 * @see Dice
 * @see Character
 * @see Menu
 * @see Square
 *
 * @author Sarah-Hans
 */

public class Game {
    // attributs qui doivent caractériser le game
    /**
     * L'objet gameBoard de type Board
     * @see Game(Character)
     * @see Game#getGameBoard()
     * @see Game#setGameBoard(Board)
     */
    private Board gameBoard;

    /**
     * Le plateau de jeu board de type ArrayList qui reçoit des Square
     * @see Game(Character)
     * @see Game#getBoard()
     * @see Game#setBoard(ArrayList)
     * @see Square
     */
    private ArrayList<Square> board;


    /**
     * Le nom du joueur de type String
     * Non modifiable
     * @see Game(Character)
     * @see Game#getPlayer1Name()
     * @see Character
     */
    private String player1Name;

    /**
     * Le chiffre obtenu au dé à chaque tour de jeu
     * @see Game(Character)
     * @see Game#getChiffreDe()
     * @see Game#setChiffreDe(int)
     * @see Dice
     */
    private int chiffreDe;

    /**
     * Le joueur player1 de type Character
     * Non modifiable
     * @see Game(Character)
     * @see Game#getPlayer1()
     * @see Character
     */
    private Character player1;

    /**
     * Variable clavier de type Scanner qui permet au joueur de faire des choix au clavier
     * @see Scanner
     * @see Game(Character)
     * @see Game#getClavier()
     * @see Game#setClavier(Scanner)
     */
    private Scanner clavier;

    /**
     * Variable de type String qui stocke le choix clavier du joueur
     * @see Game(Character)
     * @see Game#getChoix()
     * @see Game#setChoix(String)
     */
    private String choix;

    /**
     * Variable de type Square qui permet de récupérer le contenu d'une case où le joueur se positionne
     * @see Game(Character)
     * @see Game#getContentSquare()
     * @see Game#setContentSquare(Square)
     * @see Square
     */
    private Square contentSquare;

    /**
     * <b>Constructeur qui permet d'inialiser les attributs ci-dessus</b>
     * <p>
     *     Le plateau de jeu est instancié mais vide
     *     board récupère le plateau de jeu de type ArrayList
     *     player1 récupère l'objet player qui a été créé dans le Menu
     *     Le nom du player est récupéré
     *     La position initiale du joueur sur le plateau est à 0
     *     La variable contentSquare est vide
     *     L'entrée clavier est instanciée
     *     La variable de choix est vide
     * </p>
     * @param player
     *          Le joueur créé dans la classe Menu est récupéré
     * @see Game#gameBoard
     * @see Game#board
     * @see Game#player1
     * @see Game#player1Name
     * @see Game#chiffreDe
     * @see Game#contentSquare
     * @see Game#clavier
     * @see Game#choix
     */
    public Game(Character player) {
        gameBoard = new Board(null);
        board = gameBoard.getGameBoard();
        player1 = player;
        player1Name = player.getName();
        chiffreDe = 0;
        contentSquare = null;
        this.clavier = new Scanner(System.in);
        choix = null;
    }

    /**
     * <b>Lancement du jeu</b>
     * <p>
     *     Création d'une variable whatHappend qui permettra de récupérer le résultat de l'interaction en cours.
     *     Positionnement du player sur la case 1 du plateau de jeu
     *     La position du joueur casePlayer1 evolue alors en fonction
     *     Boucle pour charger les tours de jeu au lancement du dé
     * </p>
     * @see Board
     * @see Square
     * @see Game#newTurn()
     */
    public void startGame()  {
        String whatHappend;
        int position;
        System.out.println("C'est parti !");
        board = gameBoard.getGameBoard();
        position = player1.getCasePlayer();
        if (position == 0) {
            contentSquare = board.get(1);
            board.set(1, player1);
            player1.setCasePlayer(board.indexOf(player1));
        } else if (position > 0) {
            contentSquare = board.get(position);
            board.set(position, player1);
            player1.setCasePlayer(board.indexOf(player1));
        }

        System.out.println(player1Name + " tu es sur la case " + (player1.getCasePlayer()) + ". Cette case contient "+ contentSquare);
        whatHappend = contentSquare.interaction(player1);
        System.out.println(whatHappend);
        System.out.println("Lance le dé pour jouer... (tape jouer). Ou tape save pour sauvegarder ton personnage et quitter le jeu.");
        choix = clavier.nextLine();
        while (choix.equals("jouer") && player1.getCasePlayer() < 65) {
           newTurn();
        }
        if (choix.equals("save")) {
            try
            {
                //étape 1: charger la classe de driver
                Class.forName("org.postgresql.Driver");
                //étape 2: créer l'objet de connexion
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/donjonsdragons","postgres","123Donjons");
                //étape 3: créer l'objet statement
                Statement stmt = conn.createStatement();
                String nom = player1.getName();
                int vie = player1.getLife();
                int atk = player1.getAttack();
                int pos = player1.getCasePlayer();
                int statut = stmt.executeUpdate("UPDATE \"Hero\" SET \"NiveauVie\" = "+"'"+vie+"', " +
                        "\"NiveauForce\" = "+"'"+atk+"', " +
                        "\"Position\" = "+"'"+pos+"'" +
                        "WHERE \"Nom\" = "+"'"+nom+"'");
                System.out.println(statut);
                System.out.println("Votre personnage a été sauvegardé");

                //étape 4: exécuter la requête

                conn.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Bye bye");
            System.exit(0);
        }
    }

    /**
     * <b>Tour de jeu</b>
     * <p>
     *     Cette méthode sera lancée à chaque tour de boucle tant que la partie n'est pas terminée.
     *     Le dé est jeté et le joueur avance du nombre affiché sur le dé
     *     Création d'une variable exceed pour gérer le dépassement et faire revenir le joueur sur ses pas
     *     Appel de la méthode lancementInteraction() qui gère le contenu de la case et son interaction avec le joueur
     * </p>
     * @see Dice
     * @see Game#lancementInteraction()
     * @see Board
     * @throws PersonnageHorsPlateauException Si le joueur dépasse le plateau
     */
    public void newTurn() {
        int exceed;
        Dice lanceDe = new Dice();
        chiffreDe = lanceDe.lancerDe();
        System.out.println("Tu as obtenu : " + chiffreDe);
        board.set(player1.getCasePlayer(), contentSquare);
        player1.setCasePlayer(player1.getCasePlayer()+chiffreDe);
        try {
            if (player1.getCasePlayer() > 64) {
                throw new PersonnageHorsPlateauException("Vous avez dépassé le plateau !");
            }
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());
            exceed = player1.getCasePlayer() - 64;
            player1.setCasePlayer(64 - exceed);

        }
        lancementInteraction();
        System.out.println("Lance le dé pour jouer... (tape jouer). Ou tape save pour sauvegarder ton personnage et quitter le jeu.");
        choix = clavier.nextLine();
    }


    /**
     * <b>Gestion de l'interaction du joueur avec le contenu de la case</b>
     * <p>
     *     Création de la variable whatHappend qui va récupérer le résultat de l'interaction
     *     La variable contentSquare récupère le contenu de la case du joueur
     *     Si la position du joueur est à 64, celui ci a gagné la partie
     * </p>
     * @see Game#win()
     * @see Board
     * @see Square
     * @see Square#interaction(Character)
     * @see Character
     */
    public void lancementInteraction() {
        String whatHappend;
        if (player1.getCasePlayer() == 64) {
            win();
        }
        contentSquare = board.get(player1.getCasePlayer());
        System.out.println(player1Name + " tu es sur la case " + (player1.getCasePlayer()) + ". Cette case contient "+ contentSquare);
        whatHappend = contentSquare.interaction(player1);
        board.set(player1.getCasePlayer(), player1);
        System.out.println(whatHappend);
    }

    /**
     * <b>Méthode qui gère quand le player a gagné</b>
     * <p>
     *     On informe le joueur qu'il a gagné
     *     On propose au joueur de recommencer une partie ou de quitter le jeu.
     * </p>
     * @see Menu
     */
    public void win() {
        System.out.println("Case 64. Bravo, tu as gagné!");
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

    /**
     * Récupère l'objet gameBoard
     * @return l'objet gameBoard de type Board
     * @see Board
     */
    public Board getGameBoard() {
        return gameBoard;
    }

    /**
     * Met à jour le gameBoard
     * @param gameBoard
     *              l'objet plateau de jeu
     * @see Board
     */
    public void setGameBoard(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    /**
     *
     * @return le plateau de jeu de type ArrayList
     */
    public ArrayList<Square> getBoard() {
        return board;
    }

    /**
     * Met à jour le board
     * @param board
     *          l'arraylist plateau de jeu
     * @see Square
     */
    public void setBoard(ArrayList<Square> board) {
        this.board = board;
    }
    

    /**
     *
     * @return le nom du joueur
     */
    public String getPlayer1Name() {
        return player1Name;
    }

    /**
     *
     * @return le chiffre obtenu au dé
     */
    public int getChiffreDe() {
        return chiffreDe;
    }

    /**
     * Met à jour le chiffre obtenu au dé
     * @param chiffreDe
     */
    public void setChiffreDe(int chiffreDe) {
        this.chiffreDe = chiffreDe;
    }

    /**
     *
     * @return le joueur
     * @see Character
     */
    public Character getPlayer1() {
        return player1;
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

    /**
     *
     * @return le contenu de la case où le joueur se positionne
     */
    public Square getContentSquare() {
        return contentSquare;
    }

    /**
     * Met à jour le contenu de la case où le joueur se positionne
     * @param contentSquare
     */
    public void setContentSquare(Square contentSquare) {
        this.contentSquare = contentSquare;
    }
}


