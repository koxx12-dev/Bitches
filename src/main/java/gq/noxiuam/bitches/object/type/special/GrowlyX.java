package gq.noxiuam.bitches.object.type.special;

import gq.noxiuam.bitches.object.data.CodeQuality;
import gq.noxiuam.bitches.object.type.SkidderBitch;
import lombok.Getter;

/**
 * @author Noxiuam
 * https://noxiuam.gq
 */
public class GrowlyX extends SkidderBitch {

    // The amount of stars he has on github.com/GrowlyX.
    private static final int STARRED_REPOS = 563;

    @Getter private final CodeQuality codeQuality;

    public GrowlyX(CodeQuality codeQuality) {
        super(Integer.MAX_VALUE, STARRED_REPOS, true, true);
        this.codeQuality = codeQuality;
    }

}
