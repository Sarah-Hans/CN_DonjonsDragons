package Classes;

import Equipement.Arme;

public class Guerrier {
	
	private String name;
	private int life;
	private int attack;
	
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

	@Override
	public String toString() {
		return "Guerrier [name=" + name + ", life=" + life + ", attack=" + attack + "]";
	}
	

}
