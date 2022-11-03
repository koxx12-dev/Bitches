const { Bitch } = require("../Bitch");

/*
    This is a prime example of what Mainzz (former Onix Client admin) is
*/
class AnnoyingBitch extends Bitch {

    constructor(annoyingLevel, pregnant, fatherless, transgender) {
        this.annoyingLevel = annoyingLevel;
        this.pregnant = pregnant;
        this.fatherless = fatherless;
        this.transgender = transgender;
    }

}

module.exports.AnnoyingBitch = AnnoyingBitch;