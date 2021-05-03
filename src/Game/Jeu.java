package Game;

import Menu.Menu;
import Classes.Guerrier;
import Classes.Magicien;
import Game.De;

public class Jeu {
    private int casePlayer1;
    private int plateauJeu[]; // plateau de jeu
    private String player1Name;

    //constructeur
    public Jeu(Object player) {
        if(player instanceof Guerrier) {
            Guerrier guerrier = (Guerrier) player;
            player1Name = guerrier.getName();
        }
        casePlayer1 = 1;
        plateauJeu = new int [64];

    }

    public void startGame() {
        System.out.println("C'est parti !");
        System.out.println(player1Name + " tu es sur la case " + casePlayer1);
      }
}

