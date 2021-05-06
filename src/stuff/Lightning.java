package stuff;

public class Lightning extends Spell{

    public Lightning() {
        name = null;
        atkLvl = 2;
    }
    public Lightning(String name) {
        this.name = name;
        atkLvl = 2;
    }
    @Override
    public String toString() {
        return "Lightning{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
