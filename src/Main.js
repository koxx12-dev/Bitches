const os = require("os");
const fs = require("fs");
const path = require('path');
const humanNames = require('random-human-names');

const { CTTBitch } = require("./obj/type/CTTBitch");
const { CyberBitch } = require("./obj/type/CyberBitch");
const { Viet } = require("./obj/type/special/Viet");
const { AnnoyingBitch } = require("./obj/type/AnnoyingBitch");
const { Bitch } = require("./obj/Bitch");

const allMyBitches = [];

main();

function main() {

    const homeDir = os.homedir();
    const appData = process.env.APPDATA;

    const installedCheatBreakerSkid = fs.existsSync(homeDir + "\\.lunarclient");
    const installedFakeForge = fs.existsSync(appData + "\\.feather");
    const installedCrayonDrawnClient = fs.existsSync("C:\\Program Files\\Badlion Client");
    
    /*
        Since Viet wants to be "smart", he can have his own bitch, which is just mirroring his personality.
    */
    if (homeDir.includes("Humphrey")) {
        allMyBitches.push(new Viet("Viet#7065", "Prebuilt", 0, 99999999999, "Eugen Bleuler", true, true));
        return;
    }

    // Gives you more bitches, no one should ever have more than 100 though!
    for (var i = 0; i < nextInt(100); i++) {
        
        // define their basic human rights
        var name = humanNames.allRandom();
        var age = (nextInt(30) + 18);


        if (installedCheatBreakerSkid) {
            // Okay Lunar users, I am most definitely not sorry for this one.
            allMyBitches.push(new CTTBitch(nextBoolean(), nextBoolean(), nextBoolean()));
        } else if (installedFakeForge) {
            // Okay Feather users, im sorry to do this to you, but you bought forge, so here is my gift to you.
            allMyBitches.push(new CyberBitch("Prebuilt", nextBoolean()));
        } else if (installedCrayonDrawnClient) {
            // I am NOT SORRY, you can deal with the annoying bitch in the back of the class.
            allMyBitches.push(new AnnoyingBitch(nextInt(100), nextBoolean(), nextBoolean(), true));
        }

        allMyBitches.push(new Bitch(name, age));

        console.log(allMyBitches[i].getName());
    }
    
}

function nextInt(max) {
    return Math.floor(Math.random() * max)
}

function nextBoolean() {
    return Math.random() < 0.5;
}