package mobs;

/**
 * Classe Sorcerer qui hérite de la classe Ennemy
 * @see Ennemy
 * @author Sarah-Hans
 */
public class Sorcerer extends Ennemy {
    /**
     * Constructeur du Sorcerer
     * Initialise les valeurs des attributs name, lvlatk et life
     * @see Ennemy#name
     * @see Ennemy#life
     * @see Ennemy#lvlatk
     */
    public Sorcerer() {
        super("Dark Sorcerer", 2, 9);
    }

    @Override
    public String toString() {
        return "Sorcerer{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
