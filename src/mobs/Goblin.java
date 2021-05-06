package mobs;

public class Goblin extends Ennemy {
    public Goblin() {
        name = null;
        lvlatk = 1;
        life = 6;
    }
    public Goblin(String name) {
        this.name = name;
        lvlatk = 1;
        life = 6;
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
