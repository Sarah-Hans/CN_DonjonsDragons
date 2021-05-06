package mobs;

public class Dragon extends Ennemy {

    public Dragon() {
        name = null;
        lvlatk = 4;
        life = 15;
    }
    public Dragon(String name) {
        this.name = name;
        lvlatk = 4;
        life = 15;
    }
    public Dragon(String name, int lvlatk, int life) {
        this.name = name;
        this.lvlatk = lvlatk;
        this.life = life;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", lvlatk=" + lvlatk +
                ", life=" + life +
                '}';
    }
}
