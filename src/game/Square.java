package game;

import characters.Character;

/**
 * Classe qui représente une case du plateau de jeu
 * Elle est abstraite car plusieurs classes en héritent
 *
 * @see Character
 *
 * @author Sarah-Hans
 */
public abstract class Square {
    /**
     * Méthode interaction qui va gérer l'interaction du joueur avec le contenu de chaque case du plateau de jeu
     * @param player1
     *          Le joueur
     * @return une chaine de caractères
     */
    // Méthode qui va gérer les interactions du player avec le contenu des cases du jeu
    public abstract String interaction(Character player1);
}