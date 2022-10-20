package gq.noxiuam.bitches.object.type.special;

import gq.noxiuam.bitches.object.type.KittenBitch;
import lombok.Getter;

/**
 * @author Noxiuam
 * https://noxiuam.gq
 */
public class Emily extends KittenBitch {

    @Getter private final String email;

    public Emily(boolean doesAsTheyAreTold, boolean twitterUser) {
        super(doesAsTheyAreTold, twitterUser);
        this.email = "cum@cum.com";
    }
    
}
