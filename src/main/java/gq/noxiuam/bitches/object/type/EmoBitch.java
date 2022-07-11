package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import lombok.*;

/*
    Basically what 50% of Lunar Client's discord is
*/
@Getter @ToString
public class EmoBitch extends Bitch {

    private final boolean hasBarcodeWrists, wearsBlackClothes;

    public EmoBitch(boolean hasBarcodeWrists, boolean wearsBlackClothes) {
        this.hasBarcodeWrists = hasBarcodeWrists;
        this.wearsBlackClothes = wearsBlackClothes;
        this.build();
    }

}