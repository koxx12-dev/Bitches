package gq.noxiaum.bitches.obj.types.special

import gq.noxiaum.bitches.obj.Bitch
import gq.noxiaum.bitches.obj.props.Gender.Gender
import gq.noxiaum.bitches.obj.props.Race.Race

case class SubhamBitch(var canCode: Boolean, var nobodyLovesHim: Boolean, var bitchName: String , var bitchAge: Int, var bitchRace: Race, var bitchGender: Gender)
  extends Bitch(
    bitchName,
    bitchAge,
    bitchRace,
    bitchGender
) {

}
