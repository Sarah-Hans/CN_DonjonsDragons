package stuff;

import characters.Warrior;
import game.Square;
import characters.Character;

public abstract class Spell extends Square {

    protected String name;
    protected int atkLvl;

    public Spell(String name, int atkLvl) {
        this.name = name;
        this.atkLvl = atkLvl;
    }

    public void action(Character player) {
        if (player instanceof Warrior) {
            System.out.println("Il y a un sort mais tu n'as pas le droit de l'équiper.");
        } else {
            player.setAttack(player.getAttack()+ atkLvl);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtkLvl() {
        return atkLvl;
    }

    public void setAtkLvl(int atkLvl) {
        this.atkLvl = atkLvl;
    }
}
