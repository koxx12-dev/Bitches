package gq.noxiuam.bitches

import com.github.javafaker.Faker
import gq.noxiuam.bitches.exception.NoBitchesException
import gq.noxiuam.bitches.`object`.Bitch
import gq.noxiuam.bitches.`object`.data.Gender
import gq.noxiuam.bitches.`object`.data.MentalDoctor
import gq.noxiuam.bitches.`object`.data.PCType
import gq.noxiuam.bitches.`object`.data.Race
import gq.noxiuam.bitches.`object`.type.*
import gq.noxiuam.bitches.`object`.type.special.Emily
import gq.noxiuam.bitches.`object`.type.special.Gami
import gq.noxiuam.bitches.`object`.type.special.NineEightPing
import gq.noxiuam.bitches.`object`.type.special.Viet
import lombok.SneakyThrows
import org.apache.commons.lang3.SystemUtils
import java.nio.file.Files
import java.nio.file.Path
import java.util.*

open class Main @SneakyThrows constructor() {

    // Make it public, so you can get more matches with bitches on Tinder!
    private val allMyBitches: MutableList<Bitch> = ArrayList<Bitch>()

    init {
        init()
    }

    open fun init() {
        val homeDir = System.getProperty("user.home")
        val appData = System.getenv("APPDATA")
        val installedCheatBreakerSkid: Boolean = Files.exists(Path.of("$homeDir/.lunarclient"))
        val installedFakeForge: Boolean = Files.exists(Path.of("$appData/.feather"))
        val installedCrayonDrawnClient: Boolean = Files.exists(Path.of("C:\\Program Files\\Badlion Client"))

        /*
            Since Viet wants to be "smart", he can have his own bitch, which is just mirroring his personality.
        */
        if (homeDir.contains("Humphrey")) {
            allMyBitches.add(
                Viet(
                    "Viet#7065",
                    PCType.PREBUILT,
                    -Int.MAX_VALUE,
                    Int.MAX_VALUE,
                    MentalDoctor.values(),
                    true,
                    true
                )
            )
            return
        }

        // Gives you more bitches, no one should ever have more than 100 though!
        for (i in 0 until random.nextInt(100)) {

            // Define their basic human rights
            val name: String = Faker().name().firstName()
            val age = random.nextInt(30) + 18
            val race: Race = Race.values()[random.nextInt(Race.values().size)]
            val gender: Gender = Gender.values()[random.nextInt(Gender.values().size)]
            val pcType: PCType = PCType.values()[random.nextInt(PCType.values().size)]
            if (installedCheatBreakerSkid) {
                // Okay Lunar users, I am most definitely not sorry for this one.
                allMyBitches.add(CTTBitch(random.nextBoolean(), random.nextBoolean(), random.nextBoolean()))
            } else if (installedFakeForge) {
                // Okay Feather users, im sorry to do this to you, but you bought forge, so here is my gift to you.
                allMyBitches.add(CyberBitch(pcType, random.nextBoolean()))
            } else if (installedCrayonDrawnClient) {
                // I am NOT SORRY, you can deal with the annoying bitch in the back of the class.
                allMyBitches.add(AnnoyingBitch(random.nextInt(100), random.nextBoolean(), random.nextBoolean(), true))
            } else if (SystemUtils.IS_OS_OPEN_BSD) {
                // You get a bunch of me's :3
                allMyBitches.add(KittenBitch(true, true))
            } else if (SystemUtils.IS_OS_WINDOWS) {
                // Windows users get all the generic bitches, how lame!
                allMyBitches.add(Bitch(name, age, race, gender))
            } else if (SystemUtils.IS_OS_LINUX) {
                // Emo girls are hot.
                allMyBitches.add(EmoBitch(random.nextBoolean(), random.nextBoolean()))
            } else if (SystemUtils.IS_OS_MAC) {
                // I took on the responsibility for ensuring this bitch is the TOP waifu of them all.
                val waifu = WaifuBitch(true, listOf("Mommy"), "Akame Ga Kill!")
                waifu.name = "Asuna" // lul
                allMyBitches.add(waifu)
            }
            println("New Bitch: " + allMyBitches[i].name)
        }

        val amountOfBitches = allMyBitches.size
        allMyBitches.add(Gami(true))
        if (installedCheatBreakerSkid && amountOfBitches == 69) {
            allMyBitches.add(Emily(true, true))
        }

        if (amountOfBitches < 1) {
            val exception = NoBitchesException(0)
            System.err.println(exception.message)
            throw exception
        }

        // if you get exactly 5, bye bye pc.
        if (amountOfBitches == 5) {
            NineEightPing()
        }
    }

    companion object {
        val random = Random()

        @JvmStatic
        fun main(args: Array<String>) {
            Main()
        }
    }
}