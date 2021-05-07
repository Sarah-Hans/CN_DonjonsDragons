package characters;
import characters.Character;
import stuff.Spell;

public class Wizzard extends Character {

	private Spell spell;
	
	public Wizzard() {
		name = null;
		life = 3;
		attack = 8;
		spell = null;
	}
	
	public Wizzard(String name) {
		this.name = name;
		life = 3;
		attack = 8;
		spell = null;
	}
	
	public Wizzard(String name, int life, int attack, Spell spell) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.spell = spell;
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
		return "Votre Magicien : [name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}

}
