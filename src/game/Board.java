package game;

import consumables.MediumLifePotion;
import consumables.BigLifePotion;
import mobs.Dragon;
import mobs.Goblin;
import mobs.Sorcerer;
import stuff.Fireball;
import stuff.Lightning;
import stuff.Mace;
import stuff.Sword;


import java.util.ArrayList;

public class Board {

    private ArrayList<Square> gameBoard; // plateau de jeu

    public Board(ArrayList<Square> gameboard) {
        gameBoard = new ArrayList<Square>(65);
        for(int i=0; i<65; i++) {
            this.gameBoard.add(new EmptySquare());
            if(i==45 || i==52 || i==56 || i==62) {
                gameBoard.set(i, new Dragon("Dragon of Fire"));
            }
            if(i==10 || i==20 || i==25 || i==32 || i==35 || i==36 || i==37 || i==40 || i==44 || i==47) {
                gameBoard.set(i, new Sorcerer("Dark Sorcerer"));
            }
            if(i==3 || i==6 || i==9 || i==12 || i==15 || i==18 || i==21 || i==24 || i==27 || i==30) {
                gameBoard.set(i, new Goblin("Dark Goblin"));
            }
            if(i==2 || i==11 || i==5 || i==22 || i==38) {
                gameBoard.set(i, new Mace());
            }
            if(i==19 || i==26 || i==42 || i==53) {
                gameBoard.set(i, new Sword("Fire Sword"));
            }
            if(i==1 || i==4 || i==8 || i==17 || i==23) {
                gameBoard.set(i, new Lightning());
            }
            if(i==48 || i==49) {
                gameBoard.set(i, new Fireball());
            }
            if(i==7 || i==13 || i==31 || i==33 || i==39 || i==43) {
                gameBoard.set(i, new MediumLifePotion());
            }
            if(i==28 || i==41) {
                gameBoard.set(i, new BigLifePotion());
            }
        }
    }

    public ArrayList<Square> getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(ArrayList<Square> gameBoard) {
        this.gameBoard = gameBoard;
    }

}
