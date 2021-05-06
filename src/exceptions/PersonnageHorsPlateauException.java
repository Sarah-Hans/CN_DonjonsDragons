package exceptions;

public class PersonnageHorsPlateauException extends Exception {

    private String s;

    public PersonnageHorsPlateauException (String s) {
        this.s = s;
    }

    public String getMessage() {
        return s;
    }

}
