package gq.noxiuam.bitches;

import gq.noxiuam.bitches.exception.NoBitchesException;
import gq.noxiuam.bitches.object.type.special.*;
import gq.noxiuam.bitches.object.type.*;
import gq.noxiuam.bitches.object.data.*;
import gq.noxiuam.bitches.object.Bitch;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.apache.commons.lang3.SystemUtils;

import java.nio.file.*;
import java.util.*;

public class Main {

    // Make it public, so you can get more matches with bitches on Tinder!
    public final List<Bitch> allMyBitches = new ArrayList<>();

    public static final Random random = new Random();

    @SneakyThrows
    public Main() {
        this.init();
    }

    public void init() {
        String homeDir = System.getProperty("user.home");
        String appData = System.getenv("APPDATA");

        boolean installedCheatBreakerSkid = Files.exists(Path.of(homeDir + "/.lunarclient"));
        boolean installedFakeForge = Files.exists(Path.of(appData + "/.feather"));
        boolean installedCrayonDrawnClient = Files.exists(Path.of("C:\\Program Files\\Badlion Client"));

        /*
            Since Viet wants to be "smart", he can have his own bitch, which is just mirroring his personality.
        */
        if (homeDir.contains("Humphrey")) {
            this.allMyBitches.add(new Viet("Viet#7065", PCType.PREBUILT, -Integer.MAX_VALUE, Integer.MAX_VALUE, MentalDoctor.values(), true, true));
            return;
        }

        // Gives you more bitches, no one should ever have more than 100 though!
        for (int i = 0; i < random.nextInt(100); i++) {

            // Define their basic human rights
            String name = new Faker().name().firstName();
            int age = random.nextInt(30) + 18;
            Race race = Race.values()[random.nextInt(Race.values().length)];
            Gender gender = Gender.values()[random.nextInt(Gender.values().length)];
            PCType pcType = PCType.values()[random.nextInt(PCType.values().length)];

            if (installedCheatBreakerSkid) {
                // Okay Lunar users, I am most definitely not sorry for this one.
                this.allMyBitches.add(new CTTBitch(random.nextBoolean(), random.nextBoolean(), random.nextBoolean()));
            } else if (installedFakeForge) {
                // Okay Feather users, im sorry to do this to you, but you bought forge, so here is my gift to you.
                this.allMyBitches.add(new CyberBitch(pcType, random.nextBoolean()));
            } else if (installedCrayonDrawnClient) {
                // I am NOT SORRY, you can deal with the annoying bitch in the back of the class.
                this.allMyBitches.add(new AnnoyingBitch(random.nextInt(100), random.nextBoolean(), random.nextBoolean(), true));
            } else if (SystemUtils.IS_OS_OPEN_BSD) {
                // You get a bunch of me's :3
                this.allMyBitches.add(new KittenBitch(true, true));
            } else if (SystemUtils.IS_OS_WINDOWS) {
                // Windows users get all the generic bitches, how lame!
                this.allMyBitches.add(new Bitch(name, age, race, gender));
            } else if (SystemUtils.IS_OS_LINUX) {
                // Emo girls are hot.
                this.allMyBitches.add(new EmoBitch(random.nextBoolean(), random.nextBoolean()));
            } else if (SystemUtils.IS_OS_MAC) {
                // I took on the responsibility for ensuring this bitch is the TOP waifu of them all.
                WaifuBitch waifu = new WaifuBitch(true, Collections.singletonList("Mommy"), "Akame Ga Kill!");
                waifu.setName("Asuna"); // lul
                this.allMyBitches.add(waifu);
            }

            System.out.println("New Bitch: " + this.allMyBitches.get(i).toString());
        }

        int amountOfBitches = this.allMyBitches.size();

        this.allMyBitches.add(new Gami(true));
        this.allMyBitches.add(new Decencies(false));

        if (installedCheatBreakerSkid && amountOfBitches == 69) {
            this.allMyBitches.add(new Emily(true, true));
        }

        if (amountOfBitches < 1) {
            NoBitchesException exception = new NoBitchesException(0);
            System.err.println(exception.getMessage());
            throw exception;
        }

        // if you get exactly 5, bye bye pc.
        if (amountOfBitches == 5) {
            new NineEightPing();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
    
}
