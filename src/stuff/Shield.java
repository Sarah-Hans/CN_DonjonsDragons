package stuff;

import game.Square;

public class Shield extends Square {

	private String name;

	public Shield(String name) {
		this.name = name;
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
