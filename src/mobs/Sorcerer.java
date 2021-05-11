package mobs;

public class Sorcerer extends Ennemy {
    public Sorcerer() {
        super("Dark Sorcerer", 2, 9);
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
