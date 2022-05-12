package gq.noxiuam.bitches.object.type.special;

import gq.noxiuam.bitches.object.data.*;
import gq.noxiuam.bitches.object.type.EmoBitch;
import lombok.*;

/*
    This guy thinks that a library class being flagged as a Trojan after being obfuscated is what makes a program a rat, I have no words.
*/
@Getter @ToString
public class Viet extends EmoBitch {
    private String discordTag;
    private PCType shitPCThatProbablyWillBlowUpSoon;
    private int irlBitches;
    private int egoLevel;
    private MentalDoctor[] doctors;

    public Viet(String discordTag, PCType shitPCThatProbablyWillBlowUpSoon, int irlBitches, int egoLevel, MentalDoctor[] doctors, boolean faggot, boolean hasBarcodeWrists) {
        super(faggot, hasBarcodeWrists);
        this.discordTag = discordTag;
        this.shitPCThatProbablyWillBlowUpSoon = shitPCThatProbablyWillBlowUpSoon;
        this.irlBitches = irlBitches;
        this.egoLevel = egoLevel;
        this.doctors = doctors;
    }

    @Deprecated // We will not use this, as he is far worse than someone who needs mental help, Viet needs to be mentally evaluated.
    public Viet(boolean hasBarcodeWrists, boolean wearsBlackClothes) {
        super(hasBarcodeWrists, wearsBlackClothes);
    }
}
