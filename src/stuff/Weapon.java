package stuff;

import characters.Character;
import characters.Wizzard;
import game.Square;

public abstract class Weapon extends Square {

	protected String name;
	protected int atkLvl;

	public Weapon(String name, int atkLvl) {
		this.name = name;
		this.atkLvl = atkLvl;
	}

	public String interaction(Character player) {
		if (player instanceof Wizzard) {
			return "Il y a une masse mais tu n'as pas le droit de l'équiper.";
		} else {
			player.setAttack(player.getAttack()+ atkLvl);
			return "Tu récupère l'arme "+this.getName()+" et tu augmentes ton attaque de "+ this.getAtkLvl()+" points. Ton attaque est maintenant de : "+player.getAttack();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtkLvl() {
		return atkLvl;
	}

	public void setAtkLvl(int atkLvl) {
		this.atkLvl = atkLvl;
	}

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", atkLvl=" + atkLvl + "]";
	}
	

}
