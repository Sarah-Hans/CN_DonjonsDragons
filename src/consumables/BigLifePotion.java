package consumables;

/**
 * Classe qui hérite de la classe abstraite Potion
 *
 * @see Potion
 *
 * @author Sarah-Hans
 */
public class BigLifePotion extends Potion {
    /**
     * Constructeur qui initialise le nom et l'ajout de pv
     *
     */
    public BigLifePotion() {
        super("Big Life Potion", 5);
    }
}
