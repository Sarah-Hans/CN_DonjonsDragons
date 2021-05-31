package stuff;

/**
 * Arme Mace qui hérite de Weapon
 * Caractérisé par un nom et un niveau d'attaque
 *
 * @see Weapon
 * @see AttackItem
 *
 */
public class Mace extends Weapon {

    /**
     * Constructeur de Mace
     * Affectation des valeurs types pour cette arme (name et atkLvl)
     *
     * @see AttackItem#name
     * @see AttackItem#atkLvl
     */
    public Mace() {
        super("Powerfull Mace", 3);
    }

    @Override
    public String toString() {
        return "Mace{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
