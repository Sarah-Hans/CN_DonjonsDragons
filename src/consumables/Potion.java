package consumables;

import game.Square;

public abstract class Potion extends Square {
    protected int addLife;
    protected String name;

    public Potion() {
        name = null;
    }
    public int getAddLife() {
        return addLife;
    }

    public void setAddLife(int addLife) {
        this.addLife = addLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "addLife=" + addLife +
                ", name='" + name + '\'' +
                '}';
    }
}
