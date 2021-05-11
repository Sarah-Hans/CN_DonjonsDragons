package stuff;

public class Mace extends Weapon {
    public Mace() {
        super("Powerfull Mace", 3);
    }

    @Override
    public String toString() {
        return "Mace{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
