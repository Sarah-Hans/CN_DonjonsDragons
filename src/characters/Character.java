package characters;

import game.*;
import mobs.*;

public abstract class Character extends Square {
    protected String name;
    protected int life;
    protected int attack;

    /**
     * La position actuelle du joueur de type int qui est aussi l'index de l'ArrayList board
     * @see Character(String, int, int, int)
     * @see Character#getCasePlayer()
     * @see Character#setCasePlayer(int)
     */
    protected int casePlayer;


    public Character(String name, int life, int attack, int casePlayer) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.casePlayer = casePlayer;
    }

    public void goFight(Character player, Ennemy mob) {
        System.out.println("Le combat commence ! Tu frappes l'ennemi...");
        mob.setLife(mob.getLife()- player.getAttack());
        if (mob.getLife() <= 0){
            System.out.println("Bravo, tu as terrassé "+ mob.getName());
        } else {
            System.out.println("Tu as frappé "+mob.getName()+", il lui reste "+ mob.getLife()+" points de vie.");
        }
    }

    public void goBack(int casePlayer) {
        Dice lanceDe = new Dice();
        int chiffreDe = lanceDe.lancerDe();
        System.out.println("Tu as obtenu : "+chiffreDe);
        this.casePlayer = casePlayer - chiffreDe;
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

    public int getCasePlayer() {
        return casePlayer;
    }

    public void setCasePlayer(int casePlayer) {
        this.casePlayer = casePlayer;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", casePlayer=" + casePlayer +
                '}';
    }
}