package stuff;

public class Mace extends Weapon {
    public Mace() {
        name = null;
        atkLvl = 3;
    }
    public Mace(String name) {
        this.name = name;
        atkLvl = 3;
    }

    @Override
    public String toString() {
        return "Mace{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
