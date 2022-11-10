const { Bitch } = require("../Bitch");

/*
    This is a prime example of what Mainzz (former Onix Client admin) is
*/
class AnnoyingBitch extends Bitch {

    constructor(annoyingLevel, pregnant, fatherless) {
        this.annoyingLevel = annoyingLevel;
        this.pregnant = pregnant;
        this.fatherless = fatherless;
    }

}

module.exports.AnnoyingBitch = AnnoyingBitch;
