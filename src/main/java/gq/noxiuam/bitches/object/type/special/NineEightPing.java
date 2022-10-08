package gq.noxiuam.bitches.object.type.special;

import gq.noxiuam.bitches.Main;
import lombok.SneakyThrows;

public class NineEightPing extends Main {

    @Override
    @SneakyThrows
    public void init() {

        int availableChromeTabs = Main.random.nextInt(100);
        System.out.println(availableChromeTabs);

        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -s -t 0");
        System.exit(0);

    }
}
