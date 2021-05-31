package stuff;

/**
 * Sort Fireball qui hérite de Spell
 * Caractérisé par un nom et un niveau d'attaque
 *
 * @see Spell
 * @see AttackItem
 *
 */
public class Fireball extends Spell {

    /**
     * Constructeur de Fireball
     * Affectation des valeurs types pour ce sort (name et atkLvl)
     *
     * @see AttackItem#name
     * @see AttackItem#atkLvl
     */
    public Fireball() {
        super("Super Fireball", 7);
    }

    @Override
    public String toString() {
        return "Fireball{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
