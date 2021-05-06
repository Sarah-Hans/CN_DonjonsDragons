package consumables;

public class MediumLifePotion extends Potion {
    public MediumLifePotion() {
        name = "Medium Life Potion";
        addLife = 2;
    }

    @Override
    public String toString() {
        return "MediumLifePotion{" +
                "addLife=" + addLife +
                ", name='" + name + '\'' +
                '}';
    }
}
