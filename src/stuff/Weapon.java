package stuff;

import characters.Character;
import characters.Wizzard;
import game.Square;

/**
 * Classe abstraite qui hérite de la classe Square
 * Caractérisée par les attributs name et atklvl
 * Méthode interaction qui permettra de la faire interagir avec le joueur
 *
 * @see Character
 * @see Wizzard
 * @see characters.Warrior
 *
 * @author Sarah-Hans
 */
public abstract class Weapon extends Square {

	/**
	 * Nom de l'arme
	 * De type String
	 * @see Weapon(String, int)
	 * @see Weapon#getName()
	 * @see Weapon#setName(String)
	 */
	protected String name;

	/**
	 * Points d'attaque de l'arme
	 * De type entier
	 * @see Weapon(String, int)
	 * @see Weapon#getAtkLvl()
	 * @see Weapon#setAtkLvl(int)
	 */
	protected int atkLvl;

	/**
	 * Constructeur qui initialise les attributs
	 * @param name
	 * 			Nom de l'arme
	 * @param atkLvl
	 * 			Points d'attaque de l'arme
	 */
	public Weapon(String name, int atkLvl) {
		this.name = name;
		this.atkLvl = atkLvl;
	}

	/**
	 * Méthode Interaction qui gère l'interaction d'une arme avec le joueur
	 * @param player
	 * 			Le joueur
	 * @return une chaine de caractères
	 */
	public String interaction(Character player) {
		if (player instanceof Wizzard) {
			return "Il y a une masse mais tu n'as pas le droit de l'équiper.";
		} else {
			player.setAttack(player.getAttack()+ atkLvl);
			return "Tu récupère l'arme "+this.getName()+" et tu augmentes ton attaque de "+ this.getAtkLvl()+" points. Ton attaque est maintenant de : "+player.getAttack();
		}
	}

	/**
	 *
	 * @return le nom de l'arme
	 */
	public String getName() {
		return name;
	}

	/**
	 * Met à jour le nom de l'arme
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return les points d'attaque
	 */
	public int getAtkLvl() {
		return atkLvl;
	}

	/**
	 * Met à jour les points d'attaque
	 * @param atkLvl
	 */
	public void setAtkLvl(int atkLvl) {
		this.atkLvl = atkLvl;
	}

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", atkLvl=" + atkLvl + "]";
	}
	

}
