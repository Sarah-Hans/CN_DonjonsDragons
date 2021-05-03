package Game;

import Menu.Menu;
import Classes.Guerrier;
import Classes.Magicien;
import Game.De;
import java.util.Scanner;

public class Jeu {
    private int casePlayer1;
    private int plateauJeu[]; // plateau de jeu
    private String player1Name;
    private Scanner clavier;
    private String choix;
    private int chiffreDe;
    private int depassement;

    //constructeur
    public Jeu(Object player) {
        if(player instanceof Guerrier) {
            Guerrier guerrier = (Guerrier) player;
            player1Name = guerrier.getName();
        }
        casePlayer1 = 1;
        plateauJeu = new int [64];
        this.clavier = new Scanner(System.in);

    }

    public void startGame() {
        System.out.println("C'est parti !");
        System.out.println(player1Name + " tu es sur la case " + casePlayer1);
        System.out.println("Lance le dé pour jouer... (tape jouer)");
        choix = clavier.nextLine();
        while (choix.equals("jouer") && casePlayer1 < 64) {
            De lanceDe = new De();
            chiffreDe = lanceDe.lancerDe();
            System.out.println("Tu as obtenu : "+ chiffreDe);
            casePlayer1 = casePlayer1 + chiffreDe;
            if (casePlayer1 == 64) {
                System.out.println("Case 64. Bravo, tu as gagné!");
                System.out.println("1 - Recommencer une partie");
                System.out.println("2 - Quitter le jeu");
                choix = clavier.nextLine();
                if(choix.equals("1")) {
                    Menu mainMenu = new Menu();
                    mainMenu.startMenu();
                } else {
                    System.out.println("Bye bye");
                    System.exit(0);
                }
            } else if (casePlayer1 > 64) {
                depassement = casePlayer1 - 64;
                casePlayer1 = 64 - depassement;
                System.out.println("Tu es maintenant sur la case "+casePlayer1);
                System.out.println("Lance le dé pour jouer... (tape jouer)");
                choix = clavier.nextLine();
                chiffreDe = lanceDe.lancerDe();
                System.out.println("Tu as obtenu : "+ chiffreDe);
                casePlayer1 = casePlayer1 + chiffreDe;
                while(casePlayer1 > 64) {
                    depassement = casePlayer1 - 64;
                    casePlayer1 = 64 - depassement;
                    System.out.println("Tu es maintenant sur la case "+casePlayer1);
                    System.out.println("Lance le dé pour jouer... (tape jouer)");
                    choix = clavier.nextLine();
                    chiffreDe = lanceDe.lancerDe();
                    System.out.println("Tu as obtenu : "+ chiffreDe);
                    casePlayer1 = casePlayer1 + chiffreDe;
                }
            }
            System.out.println("Tu es maintenant sur la case "+casePlayer1);
            System.out.println("Lance le dé pour jouer... (tape jouer)");
            choix = clavier.nextLine();
        }

      }
}

