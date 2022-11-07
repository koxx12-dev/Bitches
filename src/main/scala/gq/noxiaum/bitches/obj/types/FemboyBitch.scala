package gq.noxiaum.bitches.obj.types

import gq.noxiaum.bitches.obj.Bitch
import gq.noxiaum.bitches.obj.props.Gender.Gender
import gq.noxiaum.bitches.obj.props.Race.Race

import scala.util.Random

case class FemboyBitch(var fatherLeft: Boolean, var astfoloFan: Boolean, var BitchName: String, var BitchAge: Int, var BitchRace: Race, var BitchGender: Gender)
  extends Bitch(
    BitchName,
    BitchAge,
    BitchRace,
    BitchGender
  )
{

  //50/50 chance baby
  def coinflipIsAstfoloFan : Boolean =
  {
    val randomInt = Random.nextInt(100)

    this.astfoloFan =  (randomInt > 50)

    return astfoloFan
  }
}
