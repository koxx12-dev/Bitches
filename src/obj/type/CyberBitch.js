const { Bitch } = require("../Bitch");

/*
    Someone who likes to buy prebuilt computers.
    Requested by https://github.com/Tellinq.
*/
class CyberBitch extends Bitch {

    constructor(pcType, gay) {
        this.pcType = pcType;
        this.gay = gay;
    }

}

module.exports.CyberBitch = CyberBitch;