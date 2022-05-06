package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import gq.noxiuam.bitches.object.data.PCType;
import lombok.*;

/*
    Someone who likes to buy prebuilt computers.
    Requested by https://github.com/Tellinq.
*/
@Getter
public class CyberBitch extends Bitch {
    private final PCType pcType;
    private final boolean gay;

    public CyberBitch(PCType pcType, boolean gay) {
        this.pcType = pcType;
        this.gay = gay;
    }
}
