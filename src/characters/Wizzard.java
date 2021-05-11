package characters;
import characters.Character;
import stuff.Spell;

public class Wizzard extends Character {

	private Spell spell;
	
	public Wizzard(String name) {
		super(name, 3, 8);
		spell = null;
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

	@Override
	public void setLife(int life) {
		super.setLife(life);
		if (super.getLife() > 6) {
			super.setLife(6);
		}
	}

	public int getAttack() {
		return attack;
	}

	@Override
	public void setAttack(int attack) {
		super.setAttack(attack);
		if (super.getAttack() > 15) {
			super.setAttack(15);
		}
	}

	@Override
	public String toString() {
		return "Votre Magicien : [name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}

}
