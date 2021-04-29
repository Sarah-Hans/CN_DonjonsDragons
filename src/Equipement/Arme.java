package Equipement;

public class Arme {

	private String name;
	private int atkLvl;
	
	public Arme(String name, int atkLvl) {
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
		return "Arme [name=" + name + ", atkLvl=" + atkLvl + "]";
	}
	

}
