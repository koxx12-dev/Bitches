package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import lombok.*;

/*
    Basically what the other 50% of Lunar Client's discord is
*/
@Getter
public class FemboyBitch extends Bitch {

    private final boolean fatherless, degenerate;
    private final int hotness = -Integer.MAX_VALUE;

    public FemboyBitch(boolean fatherless, boolean degenerate) {
        this.fatherless = fatherless;
        this.degenerate = degenerate;
        this.build();
    }

}