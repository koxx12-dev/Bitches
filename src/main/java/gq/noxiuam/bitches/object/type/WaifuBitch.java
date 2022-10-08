package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import lombok.Getter;

import java.util.*;

@Getter
public class WaifuBitch extends Bitch {

    private final boolean wifeMaterial;
    // every man has at least one of these for his waifu.
    private final List<String> sexualNicknames;
    private final String favoriteAnime;

    public WaifuBitch(boolean wifeMaterial, List<String> sexualNicknames, String favoriteAnime) {
        this.wifeMaterial = wifeMaterial;
        this.sexualNicknames = sexualNicknames;
        this.favoriteAnime = favoriteAnime;
        this.build();
    }

}
