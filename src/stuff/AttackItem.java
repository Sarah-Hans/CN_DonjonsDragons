package stuff;

import game.Square;

/**
 * Classe qui va gérer les items d'attaque (spells et weapon)
 *
 * @see Weapon
 * @see Spell
 * @see Square
 */
public abstract class AttackItem implements Square {

    /**
     * Nom de l'arme
     * De type String
     * @see AttackItem(String, int)
     * @see AttackItem#getName()
     * @see AttackItem#setName(String)
     */
    protected String name;

    /**
     * Points d'attaque de l'arme
     * De type entier
     * @see AttackItem(String, int)
     * @see AttackItem#getAtkLvl()
     * @see AttackItem#setAtkLvl(int)
     */
    protected int atkLvl;

    /**
     * Constructeur de l'AttackItem
     *
     * @param name
     *          Le nom de l'item d'attaque
     * @param atkLvl
     *          Le niveau d'attaque de l'item
     */
    public AttackItem(String name, int atkLvl) {
        this.name = name;
        this.atkLvl = atkLvl;
    }

    /**
     *
     * @return le nom de l'arme
     */
    public String getName() {
        return name;
    }

    /**
     * Met à jour le nom de l'arme
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return le niveau d'attaque de l'arme
     */
    public int getAtkLvl() {
        return atkLvl;
    }

    /**
     * Met à jour le niveau d'attaque de l'arme
     * @param atkLvl
     */
    public void setAtkLvl(int atkLvl) {
        this.atkLvl = atkLvl;
    }

    @Override
    public String toString() {
        return "AttackItem{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
