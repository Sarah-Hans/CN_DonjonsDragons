package stuff;

public class Sword extends Weapon {
    public Sword(String name) {
        this.name = name;
        atkLvl = 5;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
