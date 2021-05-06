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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Votre Guerrier :[name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}
	

}
