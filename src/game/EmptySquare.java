package game;

import characters.Character;

public class EmptySquare extends Square {

    private String name;

    @Override
    public String interaction(Character player) {
        return "Il ne se passe rien ici, tu peux continuer ton chemin.";
    }

    public EmptySquare() {
        name = "Case vide";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmptySquare{" +
                "name='" + name + '\'' +
                '}';
    }
}
