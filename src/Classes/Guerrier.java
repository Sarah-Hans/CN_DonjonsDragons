package Classes;


public class Guerrier {
	
	private String name;
	private int life;
	private int attack;
	//private Arme arme = new Arme(Arme.name, Arme.atkLvl);
	
	public Guerrier() {
		name = null;
		life = 5;
		attack = 5;
	}
	
	public Guerrier(String name) {
		this.name = name;
		life = 5;
		attack = 5;
	}
	
	public Guerrier(String name, int life, int attack) {
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
