package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import lombok.*;

/*
    This is only a joke, do not take it seriously.
    this was really only directed at Aetopia because of the echoing mic :troll:
*/
@Getter
public class CTTBitch extends Bitch {
    private final boolean usesFogInVideos, getsPeggedByWoofina, hasAShittyMic;

    public CTTBitch(boolean usesFogInVideos, boolean getsPeggedByWoofina, boolean hasAShittyMic) {
        this.usesFogInVideos = usesFogInVideos;
        this.getsPeggedByWoofina = getsPeggedByWoofina;
        this.hasAShittyMic = hasAShittyMic;
        this.create();
    }
}