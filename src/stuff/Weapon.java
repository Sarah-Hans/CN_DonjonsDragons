package stuff;

import game.Square;

public abstract class Weapon extends Square {

	protected String name;
	protected int atkLvl;

	public Weapon() {
		name = null;
	}
	public Weapon(String name) {
		this.name = name;
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
