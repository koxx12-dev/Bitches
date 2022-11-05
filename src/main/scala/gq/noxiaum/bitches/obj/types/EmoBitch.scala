package gq.noxiaum.bitches.obj.types

import gq.noxiaum.bitches.obj.Bitch
import gq.noxiaum.bitches.obj.props.Gender.Gender
import gq.noxiaum.bitches.obj.props.Race.Race

import scala.util.Random

case class EmoBitch(var blackClothesAddict: Boolean, var daddyIssues: Boolean, var BitchName: String, var BitchAge: Int, var BitchRace: Race, var BitchGender: Gender)
  extends Bitch(
    BitchName,
    BitchAge,
    BitchRace,
    BitchGender
  )
{

  //quite a few eh?
  def calculateTraumaticExperiences() : Int =
  {
    Random.nextInt(50)
  }
}
