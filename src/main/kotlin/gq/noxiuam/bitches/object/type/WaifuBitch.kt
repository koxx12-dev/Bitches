package gq.noxiuam.bitches.`object`.type

import gq.noxiuam.bitches.`object`.Bitch
import lombok.Getter

@Getter
class WaifuBitch(
    private val wifeMaterial: Boolean, // every man has at least one of these for his waifu.
    private val sexualNicknames: List<String>, private val favoriteAnime: String
) : Bitch() {
    init {
        this.build()
    }
}