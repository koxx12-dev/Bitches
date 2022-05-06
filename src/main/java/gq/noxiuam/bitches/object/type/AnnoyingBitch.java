package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import lombok.*;

/*
    This is a prime example of what Mainzz (former Onix Client admin) is
*/
@Getter @ToString
public class AnnoyingBitch extends Bitch {
    private final int annoyingLevel;

    private final boolean pregnant, fatherless, transgender;

    public AnnoyingBitch(int annoyingLevel, boolean pregnant, boolean fatherless, boolean transgender) {
        this.annoyingLevel = annoyingLevel;
        this.pregnant = pregnant;
        this.fatherless = fatherless;
        this.transgender = transgender;
        this.create();
    }
}