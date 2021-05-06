package mobs;

public class Sorcerer extends Ennemy {
    public Sorcerer() {
        name = null;
        lvlatk = 2;
        life = 9;
    }
    public Sorcerer(String name) {
        this.name = name;
        lvlatk = 2;
        life = 9;
    }
    public Sorcerer(String name, int lvlatk, int life) {
        this.name = name;
        this.lvlatk = lvlatk;
        this.life = life;
    }

    @Override
    public String toString() {
        return "Sorcerer{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
