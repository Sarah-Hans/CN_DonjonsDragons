package stuff;

import game.Square;

public abstract class AttackItem extends Square {

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

    public AttackItem(String name, int atkLvl) {
        this.name = name;
        this.atkLvl = atkLvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtkLvl() {
        return atkLvl;
    }

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
