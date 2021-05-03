package Game;

import java.util.Random;

public class De {

    private Random r;
    private int resultatDe;

    public De() {
        r = new Random();
        resultatDe = r.nextInt(6);
    }

    public int lancerDe() {
        return resultatDe;
    }
}
