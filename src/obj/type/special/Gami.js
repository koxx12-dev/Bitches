const { AnnoyingBitch } = require("../AnnoyingBitch");

class Gami extends AnnoyingBitch {

    constructor(ownsAShitServer) {
        super(1000, false, true, true);
        this.ownsAShitServer = ownsAShitServer;
    }
    
}

module.exports.Gami = Gami;