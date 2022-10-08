package gq.noxiuam.bitches;

import gq.noxiuam.bitches.exception.NoBitchesException;
import gq.noxiuam.bitches.object.type.special.*;
import gq.noxiuam.bitches.object.type.*;
import gq.noxiuam.bitches.object.data.*;
import gq.noxiuam.bitches.object.Bitch;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.nio.file.*;
import java.util.*;

public class Main {

    // Make it public, so you can get more matches with bitches on Tinder!
    public final List<Bitch> allMyBitches = new ArrayList<>();

    public static final Random random = new Random();

    @SneakyThrows
    public Main() {
        String os = System.getProperty("os.name");
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
            }

            switch (getPlatform()) {

                case WINDOWS:
                    // Windows users get all the generic bitches, how lame!
                    this.allMyBitches.add(new Bitch(name, age, race, gender));
                    break;

                case LINUX:
                    // Hold this fucking L "L"inux users
                    this.allMyBitches.add(new EmoBitch(random.nextBoolean(), random.nextBoolean()));
                    break;

                case MACOS:
                    // I took on the responsibility for ensuring this bitch is the TOP waifu of them all.
                    WaifuBitch waifu = new WaifuBitch(true, Collections.singletonList("Mommy"), "Akame Ga Kill!");
                    waifu.setName("Asuna");
                    this.allMyBitches.add(waifu);
                    break;

            }

            System.out.println("New Bitch: " + this.allMyBitches.get(i).toString());
        }

        int amountOfBitches = this.allMyBitches.size();
        if (amountOfBitches < 1) {
            NoBitchesException exception = new NoBitchesException(0);
            System.err.println(exception.getMessage());
            throw exception;
        }
    }

    private static OS getPlatform() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("win") ? OS.WINDOWS :
                (os.contains("mac") ? OS.MACOS :
                        (os.contains("linux") || os.contains("unix") ? OS.LINUX : OS.UNKNOWN));
    }

    public enum OS {
        LINUX,
        MACOS,
        WINDOWS,
        UNKNOWN
    }

    public static void main(String[] args) {
        new Main();
    }
    
}
