package stuff;

/**
 * Sort Lightning qui hérite de Spell
 * Caractérisé par un nom et un niveau d'attaque
 *
 * @see Spell
 * @see AttackItem
 *
 */
public class Lightning extends Spell{

    /**
     * Constructeur de Lightning
     * Affectation des valeurs types pour ce sort (name et atkLvl)
     *
     * @see AttackItem#name
     * @see AttackItem#atkLvl
     */
    public Lightning() {
        super("Death Lightning", 2);
    }

    @Override
    public String toString() {
        return "Lightning{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
