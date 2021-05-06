package stuff;

public class Fireball extends Spell {
    public Fireball() {
        name = null;
        atkLvl = 7;
    }
    public Fireball(String name) {
        this.name = name;
        atkLvl = 7;
    }

    @Override
    public String toString() {
        return "Fireball{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
