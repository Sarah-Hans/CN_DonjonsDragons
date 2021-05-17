package characters;

import stuff.Weapon;

/**
 * <b>Classe héritée de Character</b>
 * <p>
 *		Cette classe détermine les attributs et valeurs spécifiques au Warrior
 * </p>
 *
 * @see Character
 *
 * @author Sarah-Hans
 *
 */
public class Warrior extends Character {

	/**
	 * Arme du warrior
	 * De type objet Weapon
	 */
	private Weapon weapon;

	/**
	 * Constructeur du Warrior
	 * On récupère le nom du joueur et on initialise la vie à 5, l'attaque à 5 et la position à 0
	 * @param name
	 * 		Le nom du joueur
	 */
	public Warrior(String name) {
		super(name, 5, 5, 0);
		weapon = null;
	}

	/**
	 * Méthode interaction
	 * @param player1
	 * 			Récupère le joueur
	 * @return une chaine de caractères qui est null (la classe Character s'en charge)
	 */
	@Override
	public String interaction(Character player1) {
		return null;
	}

	/**
	 * Mise à jour de la vie du guerrier
	 * Si ses pv sont supérieurs à 10 on les met à 10 qui est le max qu'il peut avoir
	 * @param life
	 * 			Sa vie actuelle
	 */
	@Override
	public void setLife(int life) {
		super.setLife(life);
		if (super.getLife() > 10) {
			super.setLife(10);
		}
	}

	/**
	 * Mise à jour de l'attaque du guerrier
	 * Si ses points d'attaque sont supérieurs à 10, on les met à 10 qui est la valeur max
	 * @param attack
	 * 			Attaque actuelle
	 */
	@Override
	public void setAttack(int attack) {
		super.setAttack(attack);
		if (super.getAttack() > 10) {
			super.setAttack(10);
		}
	}

	@Override
	public String toString() {
		return "Warrior{" +
				"name='" + name + '\'' +
				", life=" + life +
				", attack=" + attack +
				", casePlayer=" + casePlayer +
				", weapon=" + weapon +
				'}';
	}
}
