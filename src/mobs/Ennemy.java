package mobs;

import game.Square;

public abstract class Ennemy extends Square {

    protected String name;
    protected int lvlatk;
    protected int life;

    public Ennemy() {
        name = null;
    }

    public Ennemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvlatk() {
        return lvlatk;
    }

    public void setLvlatk(int lvlatk) {
        this.lvlatk = lvlatk;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Ennemy{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
