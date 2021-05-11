package stuff;

public class Sword extends Weapon {
    public Sword() {
        super("Fire Sword", 5);
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
