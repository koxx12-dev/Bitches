package gq.noxiuam.bitches.exception;

public class NoBitchesException extends RuntimeException {

    private final int amount;

    public NoBitchesException(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return "You got " + this.amount + " and was unable to use the program, oops!" + (this.amount == 0 ? "No bitches?" : "");
    }

}
