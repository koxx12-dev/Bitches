package gq.noxiuam.bitches.exception;

public class NoBitchesException extends RuntimeException {

    private final int bitchesAmount;

    public NoBitchesException(int bitches) {
        this.bitchesAmount = bitches;
    }

    public String getMessage() {
        return "You got " + bitchesAmount + " and was unable to use the program, oops!" + (this.bitchesAmount == 0 ? "No bitches?" : "");
    }
}