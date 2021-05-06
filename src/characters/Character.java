package characters;

import game.Square;

public abstract class Character extends Square {
    protected String name;
    protected int life;
    protected int attack;

    public Character() {
        name = null;
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                '}';
    }
}