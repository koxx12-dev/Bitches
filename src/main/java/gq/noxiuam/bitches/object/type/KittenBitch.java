package gq.noxiuam.bitches.object.type;

import lombok.Getter;

@Getter
public class KittenBitch extends FemboyBitch {

    private final boolean doesAsTheyAreTold;
    private final boolean twitterUser;
    private String twitterUsername;

    public KittenBitch(boolean doesAsTheyAreTold, boolean twitterUser) {
        super(true, false);
        this.doesAsTheyAreTold = doesAsTheyAreTold;
        this.twitterUser = twitterUser;

        if (this.twitterUser)
            this.twitterUsername = "Noxiuam"; // >_<
    }


}
