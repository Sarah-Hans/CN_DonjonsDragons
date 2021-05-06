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
        this.gameBoard = new ArrayList<Square>(12);
        gameBoard.add(new EmptySquare());
        gameBoard.add(new Goblin("Dark Goblin"));
        gameBoard.add(new Sword("Fire Sword"));
        gameBoard.add(new MediumLifePotion());
        gameBoard.add(new EmptySquare());
        gameBoard.add(new Sorcerer("Dark Sorcerer"));
        gameBoard.add(new BigLifePotion());
        gameBoard.add(new EmptySquare());
        gameBoard.add(new Mace());
        gameBoard.add(new Fireball());
        gameBoard.add(new Dragon("Dragon of Fire"));
        gameBoard.add(new Lightning());
    }

    public ArrayList<Square> getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(ArrayList<Square> gameBoard) {
        this.gameBoard = gameBoard;
    }

}
