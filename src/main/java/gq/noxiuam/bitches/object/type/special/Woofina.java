package gq.noxiuam.bitches.object.type.special;

import gq.noxiuam.bitches.object.Bitch;
import lombok.*;

/*
    The baddest and hottest bitch of them all: Woofina.
    She makes everyone and everything cum in less than 5 seconds.
    Woofina is mommy.
*/
@Getter
public class Woofina extends Bitch {
    private final boolean loli;
    private final int sexyLevel, bodyCount;

    public Woofina(boolean loli, int sexyLevel, int bodyCount) {
        this.loli = loli;
        this.sexyLevel = sexyLevel;
        this.bodyCount = bodyCount;
        this.create();
    }
}
