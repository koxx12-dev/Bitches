package gq.noxiuam.bitches.`object`.type

import gq.noxiuam.bitches.`object`.Bitch
import lombok.Getter
import lombok.ToString

/*
    This is a prime example of what Mainzz (former Onix Client admin) is
*/
@Getter
@ToString
open class AnnoyingBitch(
    private val annoyingLevel: Int,
    private val pregnant: Boolean,
    private val fatherless: Boolean,
    private val transgender: Boolean
) : Bitch() {
    init {
        this.build()
    }
}