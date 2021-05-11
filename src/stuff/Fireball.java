package stuff;

public class Fireball extends Spell {
    public Fireball() {
        super("Super Fireball", 7);
    }

    @Override
    public String toString() {
        return "Fireball{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
