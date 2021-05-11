package mobs;

public class Goblin extends Ennemy {
    public Goblin() {
        super("Dark Goblin", 1, 6);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
