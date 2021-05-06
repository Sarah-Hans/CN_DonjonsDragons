package game;

import consumables.Potion;
import stuff.Weapon;

import java.util.ArrayList;

public class Board {

    private ArrayList<Square> gameBoard; // plateau de jeu

    public Board(ArrayList<Square> gameboard) {
        this.gameBoard = new ArrayList<Square>(4);
        gameBoard.add(new EmptySquare());
        gameBoard.add(new Ennemy());
        gameBoard.add(new Weapon("Sword", 5));
        gameBoard.add(new Potion(6));
    }

    public ArrayList<Square> getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(ArrayList<Square> gameBoard) {
        this.gameBoard = gameBoard;
    }

}
