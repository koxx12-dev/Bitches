const { Bitch } = require("../Bitch");


/*
    Basically what 50% of Lunar Client's discord is
*/
class EmoBitch extends Bitch {

    constructor(hasBarcodeWrists, wearsBlackClothes) {
        this.hasBarcodeWrists = hasBarcodeWrists;
        this.wearsBlackClothes = wearsBlackClothes;
    }

}

module.exports.EmoBitch = EmoBitch;