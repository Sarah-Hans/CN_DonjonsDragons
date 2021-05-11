package characters;

import game.*;
import mobs.*;

public abstract class Character extends Square {
    protected String name;
    protected int life;
    protected int attack;

    public Character() {
        name = null;
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public int goFight(Character player, Ennemy mob) {
        System.out.println("Le combat commence ! Tu frappes l'ennemi...");
        mob.setLife(mob.getLife()- player.getAttack());
        if (mob.getLife() <= 0){
            System.out.println("Bravo, tu as terrassé "+ mob.getName());
        } else {
            System.out.println("Tu as frappé "+mob.getName()+", il lui reste "+ mob.getLife()+" points de vie.");
        }
        return player.getLife();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                '}';
    }
}