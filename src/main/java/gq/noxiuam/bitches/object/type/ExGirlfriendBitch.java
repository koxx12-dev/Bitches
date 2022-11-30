package gq.noxiuam.bitches.object.type;

import gq.noxiuam.bitches.object.Bitch;
import lombok.Getter;

/**
 * @author Noxiuam
 * https://noxiuam.gq
 */
@Getter
public class ExGirlfriendBitch extends Bitch {

    private final boolean cheated;

    private final String onlyReasonIWouldTakeThemBack;

    private final int bodyCountAfterMe = 0;

    public ExGirlfriendBitch(boolean cheated, String onlyReasonIWouldTakeThemBack) {
        this.cheated = cheated;
        this.onlyReasonIWouldTakeThemBack = onlyReasonIWouldTakeThemBack;
        this.build();
    }

}
