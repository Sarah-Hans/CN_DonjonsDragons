package mobs;

/**
 * Classe Dragon qui hérite de la classe Ennemy
 * @see Ennemy
 * @author Sarah-Hans
 */
public class Dragon extends Ennemy {

    /**
     * Constructeur du Dragon
     * Initialise les valeurs des attributs name, lvlatk et life
     * @see Ennemy#name
     * @see Ennemy#life
     * @see Ennemy#lvlatk
     */
    public Dragon() {
        super("Dragon of Fire", 4, 15);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
