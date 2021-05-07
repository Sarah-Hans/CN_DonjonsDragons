package characters;

import characters.Character;
import stuff.Weapon;

public class Warrior extends Character {

	private Weapon weapon;

	public Warrior() {
		name = null;
		life = 5;
		attack = 5;
		weapon = null;
	}
	
	public Warrior(String name) {
		this.name = name;
		life = 5;
		attack = 5;
		weapon = null;
	}

	public Warrior(String name, int life, int attack, Weapon weapon) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Votre Guerrier :[name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}

}
