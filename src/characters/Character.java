package characters;

import game.*;
import mobs.*;
import stuff.AttackItem;

/**
 * <b>Gestion du joueur avec ses attributs et ses méthodes</b>
 * <p>
 *     Classe abstraite qui est également une sous classe de Square
 *     Cette classe va permettre de gérer les attributs communs à tous les jours ainsi que leurs méthodes.
 * </p>
 *
 * @see Ennemy
 * @see Dice
 *
 * @author Sarah-Hans
 */
public abstract class Character implements Square {

    /**
     * Le nom du joueur de type String
     * Modifiable
     * @see Character(String, int, int, int)
     * @see Character#getName()
     * @see Character#setName(String)
     */
    protected String name;

    protected String className;

    /**
     * Le nombre de points de vie
     * @see Character(String, int, int, int)
     * @see Character#getLife()
     * @see Character#setLife(int)
     */
    protected int life;

    /**
     * Le nombre de points d'attaque
     * @see Character(String, int, int, int)
     * @see Character#getAttack()
     * @see Character#setAttack(int)
     */
    protected int attack;

    /**
     * La position actuelle du joueur de type int qui est aussi l'index de l'ArrayList board
     * @see Character(String, int, int, int)
     * @see Character#getCasePlayer()
     * @see Character#setCasePlayer(int)
     */
    protected int casePlayer;

    protected AttackItem attackItem;

    /**
     * Constructeur qui permet d'initialiser les attributs ci-dessus
     *
     * @see Character#name
     * @see Character#life
     * @see Character#attack
     * @see Character#casePlayer
     *
     * @param name
     *          Le nom du joueur
     * @param life
     *          Les points de vie du joueur en fonction de sa classe (guerrier ou magicien)
     * @param attack
     *          Les points d'attaque du joueur en fonction de sa classe (guerrier ou magicien)
     * @param casePlayer
     */
    public Character(String name, String className, int life, int attack, int casePlayer, AttackItem attackItem) {
        this.name = name;
        this.className = className;
        this.life = life;
        this.attack = attack;
        this.casePlayer = casePlayer;
        this.attackItem = attackItem;
    }

    /**
     * Méthode qui engage le combat auprès de l'ennemi
     *
     * @see Ennemy
     *
     * @param player
     *          On récupère le joueur
     * @param mob
     *          On récupère le mob à combattre qui est sur la case
     */
    public void goFight(Character player, Ennemy mob) {
        System.out.println("Le combat commence ! Tu frappes l'ennemi...");
        mob.setLife(mob.getLife()- player.getAttack());
        if (mob.getLife() <= 0){
            System.out.println("Bravo, tu as terrassé "+ mob.getName());
        } else {
            System.out.println("Tu as frappé "+mob.getName()+", il lui reste "+ mob.getLife()+" points de vie.");
        }
    }

    /**
     * Méthode qui gère la fuite du joueur
     * Le joueur recule d'autant de cases prévues par le lancé de dés
     *
     * @see Dice
     *
     * @param casePlayer
     *              Récupère la case actuelle du joueur avant la fuite
     */
    public void goBack(int casePlayer) {
        Dice lanceDe = new Dice();
        int chiffreDe = lanceDe.lancerDe();
        System.out.println("Tu as obtenu : "+chiffreDe);
        this.casePlayer = casePlayer - chiffreDe;
        if (this.casePlayer < 1) {
            this.casePlayer = 1;
        }
    }

    /**
     *
     * @return le nom du joueur
     */
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public AttackItem getAttackItem() {
        return attackItem;
    }

    /**
     * Permet de changer le nom du joueur
     * @param name
     *          Nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return la vie actuelle du joueur
     */
    public int getLife() {
        return life;
    }

    /**
     * Met à jour les points de vie du joueur
     * @param life
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     *
     * @return les points d'attaque actuels du joueur
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Met à jour l'attaque du joueur
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     *
     * @return la position actuelle du joueur
     */
    public int getCasePlayer() {
        return casePlayer;
    }

    /**
     * Met à jour la position du joueur
     * @param casePlayer
     */
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