package stuff;

import characters.Character;
import characters.Wizzard;

/**
 * Classe abstraite qui hérite de la classe AttackItem
 * Caractérisée par les attributs name et atklvl
 * Méthode interaction qui permettra de la faire interagir avec le joueur
 *
 * @see AttackItem
 * @see Character
 * @see Wizzard
 * @see characters.Warrior
 *
 * @author Sarah-Hans
 */
public abstract class Weapon extends AttackItem {

	/**
	 * Constructeur qui initialise les attributs
	 * @param name
	 * 			Nom de l'arme
	 * @param atkLvl
	 * 			Points d'attaque de l'arme
	 */
	public Weapon(String name, int atkLvl) {
		super(name, atkLvl);
	}

	/**
	 * Méthode Interaction qui gère l'interaction d'une arme avec le joueur
	 * @param player
	 * 			Le joueur
	 * @return une chaine de caractères
	 */
	public String interaction(Character player) {
		if (player instanceof Wizzard) {
			return "Il y a une arme mais tu n'as pas le droit de l'équiper.";
		} else {
			player.setAttack(player.getAttack()+ atkLvl);
			return "Tu récupère l'arme "+this.getName()+" et tu augmentes ton attaque de "+ this.getAtkLvl()+" points. Ton attaque est maintenant de : "+player.getAttack();
		}
	}

}
