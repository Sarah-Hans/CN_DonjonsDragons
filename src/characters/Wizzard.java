package characters;
import stuff.Spell;

/**
 * <b>Classe héritée de Character</b>
 * <p>
 *		Cette classe détermine les attributs et valeurs spécifiques au Wizard
 * </p>
 *
 * @see Character
 *
 * @author Sarah-Hans
 *
 */
public class Wizzard extends Character {

	/**
	 * Constructeur du Wizzard
	 * On récupère le nom du joueur et on initialise la vie à 3, l'attaque à 8 et la position à 0
	 * @param name
	 * 		Le nom du joueur
	 */
	public Wizzard(String name) {
		super(name, "Wizzard",3, 8, 0, null);
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
	 * Mise à jour de la vie du magicien
	 * Si ses pv sont supérieurs à 6 on les met à 6 qui est le max qu'il peut avoir
	 * @param life
	 * 			Sa vie actuelle
	 */
	@Override
	public void setLife(int life) {
		super.setLife(life);
		if (super.getLife() > 6) {
			super.setLife(6);
		}
	}

	/**
	 * Mise à jour de l'attaque du magicien
	 * Si ses points d'attaque sont supérieurs à 15, on les met à 15 qui est la valeur max
	 * @param attack
	 * 			Attaque actuelle
	 */
	@Override
	public void setAttack(int attack) {
		super.setAttack(attack);
		if (super.getAttack() > 15) {
			super.setAttack(15);
		}
	}

	@Override
	public String toString() {
		return "Wizzard{" +
				"name='" + name + '\'' +
				", className='" + className + '\'' +
				", life=" + life +
				", attack=" + attack +
				", casePlayer=" + casePlayer +
				", attackItem=" + attackItem +
				'}';
	}
}
