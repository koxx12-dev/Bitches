package gq.noxiuam.bitches.object.type.special;

import gq.noxiuam.bitches.object.type.AnnoyingBitch;
import lombok.Getter;

/**
 * @author Noxiuam
 * https://noxiuam.gq
 */
@Getter
public class Gami extends AnnoyingBitch {

    private final boolean ownsAShitServer;

    public Gami(boolean ownsAShitServer) {
        super(1000, false, true, true);
        this.ownsAShitServer = ownsAShitServer;
        this.build();
    }

}
