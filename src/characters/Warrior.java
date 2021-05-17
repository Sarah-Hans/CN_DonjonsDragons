package characters;

import characters.Character;
import stuff.Weapon;

public class Warrior extends Character {

	private Weapon weapon;

	public Warrior(String name) {
		super(name, 5, 5, 0);
		weapon = null;
	}

	@Override
	public String interaction(Character player1) {
		return null;
	}

	@Override
	public void setLife(int life) {
		super.setLife(life);
		if (super.getLife() > 10) {
			super.setLife(10);
		}
	}
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
