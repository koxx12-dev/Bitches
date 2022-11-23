package gq.noxiuam.bitches.object.type;

import lombok.Getter;

/**
 * @author Noxiuam
 * https://noxiuam.gq
 *
 * What `Preceding#5176` is!
 */
@Getter
public class SkidderBitch extends EmoBitch {

    private final int amountOfCodeStolen, skiddedRepositories;

    private final boolean disgustingBrackets, poorNamingConventions;

    public SkidderBitch(int amountOfCodeStolen, int skiddedRepositories, boolean disgustingBrackets, boolean poorNamingConventions) {
        super(true, true);
        this.amountOfCodeStolen = amountOfCodeStolen;
        this.skiddedRepositories = skiddedRepositories;

        this.disgustingBrackets = disgustingBrackets;
        this.poorNamingConventions = poorNamingConventions;
    }

}
