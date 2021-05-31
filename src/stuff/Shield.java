package stuff;

import characters.Character;
import game.Square;

public class Shield implements Square {

	private String name;

	public Shield(String name) {
		this.name = name;
	}

	@Override
	public String interaction(Character player1) {
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shield{" +
				"name='" + name + '\'' +
				'}';
	}
}
