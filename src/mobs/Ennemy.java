package mobs;

import game.Square;
import characters.Character;

public abstract class Ennemy extends Square {

    protected String name;
    protected int lvlatk;
    protected int life;

    public Ennemy(String name, int lvlatk, int life) {
        this.name = name;
        this.lvlatk = lvlatk;
        this.life = life;
    }

    public int atkMob(Character player, Ennemy mob) {
        System.out.println("L'ennemi te frappe...");
        player.setLife(player.getLife()- mob.getLvlatk());
        if (player.getLife() <= 0){
            System.out.println(mob.getName()+ " t'a tué. Tu as perdu !");
            System.out.println("Bye bye");
            System.exit(0);
        } else {
            System.out.println("Il te reste "+ player.getLife()+" points de vie. "+mob.getName()+" s'enfuit...");
        }
        return mob.getLife();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvlatk() {
        return lvlatk;
    }

    public void setLvlatk(int lvlatk) {
        this.lvlatk = lvlatk;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Ennemy{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
