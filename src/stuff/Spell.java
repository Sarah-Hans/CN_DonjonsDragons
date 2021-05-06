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

}
