package Classes;

public class Magicien {

	private String name;
	private int life;
	private int attack;
	
	public Magicien() {
		name = null;
		life = 3;
		attack = 8;
	}
	
	public Magicien(String name) {
		this.name = name;
		life = 3;
		attack = 8;
	}
	
	public Magicien(String name, int life, int attack) {
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
		return "Votre Magicien : [name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}

}
