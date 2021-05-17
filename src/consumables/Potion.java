package consumables;

import characters.Character;
import game.Square;

public abstract class Potion extends Square {
    protected int addLife;
    protected String name;

    public Potion(String name, int addLife) {
        this.name = name;
        this.addLife = addLife;
    }

    public String interaction(Character player) {
        player.setLife(player.getLife() + addLife);
       return "Tu récupères "+((Potion) this).getName()+" et tu gagnes "+((Potion) this).getAddLife()+" points de vie. Ta vie est maintenant de : "+player.getLife();
    }
    public int getAddLife() {
        return addLife;
    }

    public void setAddLife(int addLife) {
        this.addLife = addLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "addLife=" + addLife +
                ", name='" + name + '\'' +
                '}';
    }
}
