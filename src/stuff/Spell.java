package stuff;

import game.Square;

public abstract class Spell extends Square {

    protected String name;
    protected int atkLvl;

    public Spell() {
        name = null;
    }

    public Spell(String name) {
        this.name = name;
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
}
