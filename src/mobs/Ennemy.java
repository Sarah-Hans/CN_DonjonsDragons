package mobs;

import game.Square;
import characters.Character;
import java.util.Scanner;

/**
 * Classe abstraite qui gère les différents types d'ennemis
 * Contient la méthode interaction qui définit ce qui se passe quand un joueur rencontre un ennemi
 * @see Square
 * @see Character
 *
 * @author Sarah-Hans
 */
public abstract class Ennemy extends Square {

    /**
     * Le nom de l'ennemi
     * De type String
     * @see Ennemy#Ennemy(String, int, int)
     * @see Ennemy#getName()
     * @see Ennemy#setName(String)
     */
    protected String name;

    /**
     * Le niveau d'attaque de l'ennemi
     * De type entier
     * @see Ennemy#Ennemy(String, int, int)
     * @see Ennemy#getLvlatk()
     * @see Ennemy#setLvlatk(int)
     */
    protected int lvlatk;

    /**
     * Le nombre de points de vie de l'ennemi
     * De type entier
     * @see Ennemy#Ennemy(String, int, int)
     * @see Ennemy#getLife()
     * @see Ennemy#setLife(int)
     */
    protected int life;

    /**
     * Constructeur de la classe Ennemy
     *
     * @param name
     *          Nom du mob
     * @param lvlatk
     *          niveau d'attaque
     * @param life
     *          points de vie
     *
     * @see Ennemy#name
     * @see Ennemy#lvlatk
     * @see Ennemy#life
     */
    public Ennemy(String name, int lvlatk, int life) {
        this.name = name;
        this.lvlatk = lvlatk;
        this.life = life;
    }

    /**
     * Interaction du mob avec le joueur
     * Possibilité d'attaquer l'ennemi ou de fuir
     *
     * @param player1
     *          Le joueur
     * @return une chaine de caractères
     *
     * @see Character
     * @see Character#goFight(Character, Ennemy)
     * @see Ennemy#atkMob(Character, Ennemy)
     * @see Character#goBack(int)
     * @see Character#getCasePlayer()
     */
    @Override
    public String interaction(Character player1) {
        String choix;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Tu vas devoir affronter "+(this.getName()));
        System.out.println("Tape go pour engager le combat ! Ou tape esc pour fuir !");
        choix = clavier.nextLine();
        if (choix.equals("go")) {
            player1.goFight(player1, this);
            if (this.getLife() > 0) {
                this.atkMob(player1, this);
            }
            return "Etat de ton personnage : "+player1;

        } else if (choix.equals("esc")) {
            player1.goBack(player1.getCasePlayer());
            return "Tu fuis l'ennemi et tu recules... Tu es sur la case : "+ player1.getCasePlayer();
        } else {
            return "Bye bye";
        }
    }

    /**
     * <b>Méthode qui gère l'attaque de l'ennemi</b>
     *
     * @param player
     *          Le joueur
     * @param mob
     *          L'ennemi
     * @return les pv du mob (entier)
     *
     * @see Character
     * @see Ennemy#getLife()
     * @see Ennemy#getLvlatk()
     * @see Ennemy#getName()
     */
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

    /**
     *
     * @return le nom du mob
     */
    public String getName() {
        return name;
    }

    /**
     * Met à jour le nom du mob
     * @param name
     *          Le nom du mob
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return le niveau d'attaque du mob
     */
    public int getLvlatk() {
        return lvlatk;
    }

    /**
     * Met à jour le niveau d'attaque
     * @param lvlatk
     */
    public void setLvlatk(int lvlatk) {
        this.lvlatk = lvlatk;
    }

    /**
     *
     * @return les points de vie du mob
     */
    public int getLife() {
        return life;
    }

    /**
     * Met à jour les pv du mob
     * @param life
     */
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
