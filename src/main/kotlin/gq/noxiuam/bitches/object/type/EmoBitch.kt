package gq.noxiuam.bitches.`object`.type

import gq.noxiuam.bitches.`object`.Bitch
import lombok.Getter
import lombok.ToString

/*
    Basically what 50% of Lunar Client's discord is
*/
@Getter
@ToString
open class EmoBitch(private val hasBarcodeWrists: Boolean, private val wearsBlackClothes: Boolean) : Bitch() {
    init {
        this.build()
    }
}