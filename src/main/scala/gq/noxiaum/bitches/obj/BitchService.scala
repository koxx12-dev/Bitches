package gq.noxiaum.bitches.obj

import gq.noxiaum.bitches.obj.props.{Gender, Race}

object BitchService {

  def constrcutBlank() : Bitch =
  {
    Bitch(Option("ChangeMe"), 100, Option(Race.HISPANIC), Option(Gender.ETC))
  }

  def nameIsThere(bitch: Bitch) : Boolean =
  {
    bitch.name.isDefined
  }
}
