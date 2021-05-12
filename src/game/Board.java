package game;

import java.util.Collections;
import consumables.*;
import mobs.*;
import stuff.*;

import java.util.ArrayList;

/**
 * <b>Le plateau de jeu</b>
 * <p>
 *     Classe qui construit le plateau de jeu au moyen d'une variable de type ArrayList
 * </p>
 * @see Square
 * @see Potion
 * @see Weapon
 * @see Spell
 * @see Ennemy
 * @see EmptySquare
 *
 * @author Sarah-Hans
 */
public class Board {

    /**
     * Variable gameBoard de type ArrayList qui est le plateau de jeu
     * @see Square
     */
    private ArrayList<Square> gameBoard; // plateau de jeu

    /**
     * <b>Constructeur du Board</b>>
     * <p>
     *     On popule le tableau en remplissant les cases en fonction de leur index
     *     On rend le contenu des case aléatoire ensuite, le shuffle va mélanger les cases.
     * </p>
     * @param gameboard
     *              Le  plateau de jeu
     *
     * @see Square
     * @see Square
     * @see Potion
     * @see Weapon
     * @see Spell
     * @see Ennemy
     * @see EmptySquare
     */
    public Board(ArrayList<Square> gameboard) {
        gameBoard = new ArrayList<Square>();
        for(int i=0; i<65; i++) {
            this.gameBoard.add(new EmptySquare());

            if(i==45 || i==52 || i==56 || i==62) {
                this.gameBoard.set(i, new Dragon());
            }
            if(i==10 || i==20 || i==25 || i==32 || i==35 || i==36 || i==37 || i==40 || i==44 || i==47) {
                this.gameBoard.set(i, new Sorcerer());
            }
            if(i==3 || i==6 || i==9 || i==12 || i==15 || i==18 || i==21 || i==24 || i==27 || i==30) {
                this.gameBoard.set(i, new Goblin());
            }
            if(i==2 || i==11 || i==5 || i==22 || i==38) {
                this.gameBoard.set(i, new Mace());
            }
            if(i==19 || i==26 || i==42 || i==53) {
                this.gameBoard.set(i, new Sword());
            }
            if(i==1 || i==4 || i==8 || i==17 || i==23) {
                this.gameBoard.set(i, new Lightning());
            }
            if(i==48 || i==49) {
                this.gameBoard.set(i, new Fireball());
            }
            if(i==7 || i==13 || i==31 || i==33 || i==39 || i==43) {
                this.gameBoard.set(i, new MediumLifePotion());
            }
            if(i==28 || i==41) {
                this.gameBoard.set(i, new BigLifePotion());
            }
        }
        Collections.shuffle(this.gameBoard);
    }

    /**
     *
     * @return le plateau de jeu qui est une ArrayList
     */
    public ArrayList<Square> getGameBoard() {
        return gameBoard;
    }

    /**
     * Met à jour le plateau de jeu
     * @param gameBoard
     */
    public void setGameBoard(ArrayList<Square> gameBoard) {
        this.gameBoard = gameBoard;
    }

}
