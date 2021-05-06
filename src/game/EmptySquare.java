package game;

public class EmptySquare extends Square {

    private String name;

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
