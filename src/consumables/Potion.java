package consumables;

import game.Square;

public class Potion extends Square {
    private int addLife;
    private String namePotion;

    public Potion(int addLife) {
        this.addLife = addLife;
        namePotion = "Potion de vie";
    }

    public int getAddLife() {
        return addLife;
    }

    public void setAddLife(int addLife) {
        this.addLife = addLife;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "addLife=" + addLife +
                ", namePotion='" + namePotion + '\'' +
                '}';
    }
}
