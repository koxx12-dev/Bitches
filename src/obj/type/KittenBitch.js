const { Bitch } = require("../Bitch");

class KittenBitch extends Bitch {

    static twitterUsername;

    constructor(doesAsTheyAreTold, twitterUser) {
        this.doesAsTheyAreTold = doesAsTheyAreTold;
        this.twitterUser = twitterUser;

        if (this.twitterUser)
            this.twitterUsername = "Noxiuam"; // >_<
    }

}

module.exports.KittenBitch = KittenBitch;