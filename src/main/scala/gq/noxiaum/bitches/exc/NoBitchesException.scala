package gq.noxiaum.bitches.exc

case class NoBitchesException(var amountMissing: Int) extends RuntimeException {

  override def getMessage: String = "You have absolutely no bitches! Amount missing: " + amountMissing
}
