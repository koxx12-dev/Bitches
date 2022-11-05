package gq.noxiaum.bitches.obj

object BitchService {

  def constructBlank() : Bitch =
  {
   Bitch
  }

  def nameIsThere(bitch: Bitch) : Boolean =
  {
    bitch.name.isDefined
  }
}
