package stuff;

public class Lightning extends Spell{

    public Lightning() {
        super("Death Lightning", 2);
    }

    @Override
    public String toString() {
        return "Lightning{" +
                "name='" + name + '\'' +
                ", atkLvl=" + atkLvl +
                '}';
    }
}
