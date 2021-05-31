package stuff;

import characters.Warrior;
import characters.Character;
import characters.Wizzard;

/**
 * Classe abstraite qui hérite de la classe AttackItem
 * Caractérisée par les attributs name et atklvl
 * Méthode interaction qui permettra de la faire interagir avec le joueur
 *
 * @see AttackItem
 * @see Character
 * @see Warrior
 * @see characters.Warrior
 *
 * @author Sarah-Hans
 */
public abstract class Spell extends AttackItem {

    /**
     * Constructeur qui initialise les attributs
     * @param name
     * 			Nom de du sort
     * @param atkLvl
     * 			Points d'attaque du sort
     */
    public Spell(String name, int atkLvl) {
        super(name, atkLvl);

    }

    /**
     * Méthode Interaction qui gère l'interaction d'un sort avec le joueur
     * @param player
     * 			Le joueur
     * @return une chaine de caractères
     */
    public String interaction(Character player) {
        if (player instanceof Warrior) {
            return "Il y a un sort mais tu n'as pas le droit de l'équiper.";
        } else {
            player.setAttack(player.getAttack()+ atkLvl);
            return "Tu récupères le sort "+ this.getName()+" et tu augmentes ton attaque de "+ this.getAtkLvl()+" points. Ton attaque est maintenant de : "+player.getAttack();
        }
    }

}
