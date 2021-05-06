package game;

import java.util.Random;

public class Dice {

    private Random r;
    private int resultatDe;
    private int min;
    private int max;

    public Dice() {
        min = 1;
        max = 6;
        r = new Random();
        resultatDe = r.nextInt(max - min + 1) + min;
    }

    public int lancerDe() {
        return resultatDe;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getResultatDe() {
        return resultatDe;
    }

    public void setResultatDe(int resultatDe) {
        this.resultatDe = resultatDe;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "r=" + r +
                ", resultatDe=" + resultatDe +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
