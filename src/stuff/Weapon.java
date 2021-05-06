package stuff;

import game.Square;

public class Weapon extends Square {

	private String name;
	private int atkLvl;
	
	public Weapon(String name, int atkLvl) {
		this.name = name;
		this.atkLvl = atkLvl;
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
