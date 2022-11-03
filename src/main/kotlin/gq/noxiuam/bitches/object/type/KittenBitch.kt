package gq.noxiuam.bitches.`object`.type

import lombok.Getter

@Getter
open class KittenBitch(private val doesAsTheyAreTold: Boolean, private val twitterUser: Boolean) :
    FemboyBitch(true, false) {
    private var twitterUsername: String? = null

    init {
        if (twitterUser) twitterUsername = "Noxiuam" // >_<
    }
}