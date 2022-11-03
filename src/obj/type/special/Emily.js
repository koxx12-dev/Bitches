const { KittenBitch } = require("../KittenBitch");

class Emily extends KittenBitch {

    constructor(doesAsTheyAreTold, twitterUser) {
        super(doesAsTheyAreTold, twitterUser);
        this.email = "cum@cum.com";
    }

}

module.exports.Emily = Emily;