package gq.noxiuam.bitches.exception

class NoBitchesException(private val amount: Int) : RuntimeException() {
    override val message: String
        get() = "You got " + amount + " and was unable to use the program, oops!" + if (amount == 0) "No bitches?" else ""
}