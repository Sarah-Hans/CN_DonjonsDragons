package consumables;

/**
 * Classe qui hérite de la classe abstraite Potion
 *
 * @see Potion
 *
 * @author Sarah-Hans
 */
public class MediumLifePotion extends Potion {

    /**
     * Constructeur qui initialise le nom et l'ajout de pv
     *
     */
    public MediumLifePotion() {
        super("Medium Life Potion", 2);
    }
}
