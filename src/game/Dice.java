package game;

import java.util.Random;

/**
 * <b>Classe qui représente le dé</b>
 * Objet dé avec une méthode de lancer de dé
 *
 * @autho Sarah-Hans
 */
public class Dice {

    /**
     * Variable r de type Random
     * @see Dice()
     * @see Dice#getR()
     * @see Dice#setR(Random)
     */
    private Random r;

    /**
     * Variable qui stockera le résultat du dé
     * De type entier
     * @see Dice()
     * @see Dice#getResultatDe()
     * @see Dice#setResultatDe(int)
     */
    private int resultatDe;

    /**
     * Variable qui stocke le résultat minimum
     * De type entier
     * @see Dice()
     * @see Dice#getMin()
     * @see Dice#setMin(int)
     */
    private int min;

    /**
     * Variable qui stocke le résultat maximum
     * De type entier
     * @see Dice()
     * @see Dice#getMax()
     * @see Dice#setMax(int)
     */
    private int max;

    /**
     * Constructeur du Dé qui va initialiser tous les attributs ci-dessus
     * Min défini sur 1 et max défini sur 6
     * r instancie un nouveau Random
     * resultatDe est défini avec la méthode nextInt
     * @see Dice#min
     * @see Dice#max
     * @see Dice#r
     * @see Dice#resultatDe
     */
    public Dice() {
        min = 1;
        max = 6;
        r = new Random();
        resultatDe = r.nextInt(max - min + 1) + min;
    }

    /**
     * La méthode lancerDe
     * @return le resultat du dé
     */
    public int lancerDe() {
        return resultatDe;
    }

    /**
     *
     * @return r qui est de type Random
     */
    public Random getR() {
        return r;
    }

    /**
     * Mise à jour du r
     * @param r
     */
    public void setR(Random r) {
        this.r = r;
    }

    /**
     *
     * @return le résultat du dé
     */
    public int getResultatDe() {
        return resultatDe;
    }

    /**
     * Mise à jour du résultat du dé
     * @param resultatDe
     */
    public void setResultatDe(int resultatDe) {
        this.resultatDe = resultatDe;
    }

    /**
     *
     * @return la valeur minimum
     */
    public int getMin() {
        return min;
    }

    /**
     * Met à jour la valeur minimum
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     *
     * @return la valeur maximum
     */
    public int getMax() {
        return max;
    }

    /**
     * Mise à jour de la valeur max
     * @param max
     */
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
