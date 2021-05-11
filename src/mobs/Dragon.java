package mobs;

public class Dragon extends Ennemy {

    public Dragon() {
        super("Dragon of Fire", 4, 15);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
