package stuff;

/**
 * Arme Sword qui hérite de Weapon
 * Caractérisé par un nom et un niveau d'attaque
 *
 * @see Weapon
 * @see AttackItem
 *
 */
public class Sword extends Weapon {

    /**
     * Constructeur de Sword
     * Affectation des valeurs types pour cette arme (name et atkLvl)
     *
     * @see AttackItem#name
     * @see AttackItem#atkLvl
     */
    public Sword() {
        super("Fire Sword", 5);
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
