package gq.noxiuam.bitches.`object`.type.special

import gq.noxiuam.bitches.`object`.data.MentalDoctor
import gq.noxiuam.bitches.`object`.data.PCType
import gq.noxiuam.bitches.`object`.type.EmoBitch
import lombok.Getter
import lombok.ToString

/*
    This guy thinks that a library class being flagged as a Trojan after being obfuscated is what makes a program a rat, I have no words.
*/
@Getter
@ToString
class Viet : EmoBitch {
    private var discordTag: String? = null
    private var shitPCThatProbablyWillBlowUpSoon: PCType? = null
    private var irlBitches = 0
    private var egoLevel = 0
    private lateinit var doctors: Array<MentalDoctor>

    constructor(
        discordTag: String?,
        shitPCThatProbablyWillBlowUpSoon: PCType?,
        irlBitches: Int,
        egoLevel: Int,
        doctors: Array<MentalDoctor>,
        faggot: Boolean,
        hasBarcodeWrists: Boolean
    ) : super(faggot, hasBarcodeWrists) {
        this.discordTag = discordTag
        this.shitPCThatProbablyWillBlowUpSoon = shitPCThatProbablyWillBlowUpSoon
        this.irlBitches = irlBitches
        this.egoLevel = egoLevel
        this.doctors = doctors
    }

    @Deprecated("") // We will not use this, as he is far worse than someone who needs mental help, Viet needs to be mentally evaluated.
    constructor(hasBarcodeWrists: Boolean, wearsBlackClothes: Boolean) : super(hasBarcodeWrists, wearsBlackClothes)
}