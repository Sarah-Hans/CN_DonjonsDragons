package mobs;

/**
 * Classe Goblin qui hérite de la classe Ennemy
 * @see Ennemy
 * @author Sarah-Hans
 */
public class Goblin extends Ennemy {

    /**
     * Constructeur du Goblin
     * Initialise les valeurs des attributs name, lvlatk et life
     * @see Ennemy#name
     * @see Ennemy#life
     * @see Ennemy#lvlatk
     */
    public Goblin() {
        super("Dark Goblin", 1, 6);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
