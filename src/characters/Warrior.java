package characters;

import characters.Character;

public class Warrior extends Character {

	public Warrior() {
		name = null;
		life = 5;
		attack = 5;
	}
	
	public Warrior(String name) {
		this.name = name;
		life = 5;
		attack = 5;
	}

	public Warrior(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Votre Guerrier :[name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}

}
