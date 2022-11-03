package gq.noxiuam.bitches.`object`.type.special

import gq.noxiuam.bitches.`object`.type.AnnoyingBitch
import lombok.Getter

/**
 * @author Noxiuam
 * https://noxiuam.gq
 */
@Getter
class Gami(private val ownsAShitServer: Boolean) : AnnoyingBitch(1000, false, true, true) {
    init {
        this.build()
    }
}