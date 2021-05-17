package game;

import characters.Character;
import consumables.*;
import mobs.*;
import stuff.*;

import java.util.Scanner;

public abstract class Square {
    // Méthode qui va gérer les interactions du player avec le contenu des cases du jeu
    public abstract String interaction(Character player1);
}