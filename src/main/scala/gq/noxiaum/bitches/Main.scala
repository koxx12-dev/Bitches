package gq.noxiaum.bitches

import gq.noxiaum.bitches.exc.NoBitchesException
import gq.noxiaum.bitches.obj.Bitch
import gq.noxiaum.bitches.obj.props.{Gender, Race}
import gq.noxiaum.bitches.obj.types.EmoBitch
import gq.noxiaum.bitches.obj.types.special.SubhamBitch
import org.apache.commons.lang3.SystemUtils

import java.nio.file.{Files, Path}
import java.util
import scala.util.Random


class Main {

  //keep track
  val allMyBitches: util.ArrayList[Bitch] = util.ArrayList[Bitch]

  def main(args: Array[String]): Unit =
  {
    init()
  }

  def init(): Unit = {
    val random = Random
    val homeDir = System.getProperty("user.home")
    val appData = System.getenv("APPDATA")
    val installedCheatBreakerSkid = Files.exists(Path.of(homeDir + "/.lunarclient"))
    val installedFakeForge = Files.exists(Path.of(appData + "/.feather"))
    val installedCrayonDrawnClient = Files.exists(Path.of("C:\\Program Files\\Badlion Client"))

    val isAvidGradleUser = Files.exists(Path.of(homeDir + "/.gradle"))


    // Gives you more bitches, no one should ever have more than 100 though!
    var i = 0
    while ( i < random.nextInt(100) ) { // Define their basic human rights
      val name = "TestingName"
      val age = random.nextInt(30) + 18

      val race = this.random(Race.values)
      val gender = this.random(Gender.values)

      if (SystemUtils.IS_OS_LINUX) { // Emo girls are hot.
        this.allMyBitches.add(new EmoBitch(random.nextBoolean, random.nextBoolean(), name, age, race, gender))
      }

      System.out.println("New Bitch: " + this.allMyBitches.get(i).toString)

      i += 1
    }

    if (isAvidGradleUser)
      {
        //THIS IS NOT RACIST I THINK GROWLY IS INDIAN I AM SORRY IF YOU ARE NOT SUBHAM
        this.allMyBitches.add(new SubhamBitch(random.nextBoolean(), random.nextBoolean(), "Daddy Subham", 16, Race.INDIAN, Gender.MALE))

        System.out.println("I am sorry fellow coder friend, but GrowlyX (aka Subham) uses gradle so you must get him as a bitch")
      }

    val amountOfBitches = this.allMyBitches.size

    if (amountOfBitches < 1) {
      val exception = new NoBitchesException(0)
      System.err.println(exception.getMessage)
      throw exception
    }
  }

  def random[T](s: Set[T]): T = {
    val n = Random.nextInt(s.size)
    s.iterator.drop(n).next
  }
}
