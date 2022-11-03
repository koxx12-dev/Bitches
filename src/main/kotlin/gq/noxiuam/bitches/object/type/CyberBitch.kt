package gq.noxiuam.bitches.`object`.type

import gq.noxiuam.bitches.`object`.Bitch
import gq.noxiuam.bitches.`object`.data.PCType
import lombok.Getter

/*
    Someone who likes to buy prebuilt computers.
    Requested by https://github.com/Tellinq.
*/
@Getter
open class CyberBitch(pcType: PCType, gay: Boolean) : Bitch() {
    private val pcType: PCType
    private val gay: Boolean

    init {
        this.pcType = pcType
        this.gay = gay
    }
}