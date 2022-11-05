package gq.noxiaum.bitches.obj

import gq.noxiaum.bitches.obj.props.Gender.Gender
import gq.noxiaum.bitches.obj.props.Race.Race

case class Bitch(var name: Option[String], var age: Int, var race: Option[Race], var gender: Option[Gender]) {

}
