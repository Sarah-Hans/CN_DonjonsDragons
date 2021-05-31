package game;

import characters.Character;

/**
 * Classe qui représente une case vide
 * Héritée de Square
 *
 * @see Square
 * @see Character
 *
 * @author Sarah-Hans
 */
public class EmptySquare implements Square {

    /**
     * Variable qui représente le nom de la case
     * @see EmptySquare()
     * @see EmptySquare#getName()
     * @see EmptySquare#setName(String)
     */
    private String name;

    /**
     * Constructeur qui initialise l'attribut name
     *
     * @see EmptySquare#name
     */
    public EmptySquare() {
        name = "Case vide";
    }

    /**
     * Méthode interaction
     * @param player
     *          Le joueur
     * @return une chaine de caractères qui indique le contenu de la case
     *
     * @see Character
     */
    @Override
    public String interaction(Character player) {
        return "Il ne se passe rien ici, tu peux continuer ton chemin.";
    }

    /**
     *
     * @return récupérer le nom de la case
     */
    public String getName() {
        return name;
    }

    /**
     * Mettre à jour le nom de la case
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmptySquare{" +
                "name='" + name + '\'' +
                '}';
    }
}
