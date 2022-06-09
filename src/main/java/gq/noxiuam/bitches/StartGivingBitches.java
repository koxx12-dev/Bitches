package gq.noxiuam.bitches;

import gq.noxiuam.bitches.object.type.special.*;
import gq.noxiuam.bitches.object.type.*;
import gq.noxiuam.bitches.object.data.*;
import gq.noxiuam.bitches.object.Bitch;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.nio.file.*;
import java.util.*;

public class StartGivingBitches {
    // Make it public, so you can get more matches with bitches on Tinder!
    public final List<Bitch> allMyBitches = new ArrayList<>();

    @SneakyThrows
    public StartGivingBitches() {
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
        for (int i = 0; i < new Random().nextInt(100); i++) {

            // Define their basic human rights
            String name = new Faker().name().firstName();
            int age = new Random().nextInt(30) + 18;
            Race race = Race.values()[new Random().nextInt(Race.values().length)];
            Gender gender = Gender.values()[new Random().nextInt(Gender.values().length)];
            PCType pcType = PCType.values()[new Random().nextInt(PCType.values().length)];

            if (installedCheatBreakerSkid) {
                // Okay Lunar users, I am most definitely not sorry for this one.
                this.allMyBitches.add(new CTTBitch(new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean()));
            } else if (installedFakeForge) {
                // Okay Feather users, im sorry to do this to you, but you bought forge, so here is my gift to you.
                this.allMyBitches.add(new CyberBitch(pcType, new Random().nextBoolean()));
            } else if (installedCrayonDrawnClient) {
                // I am NOT SORRY, you can deal with the annoying bitch in the back of the class.
                this.allMyBitches.add(new AnnoyingBitch(new Random().nextInt(100), new Random().nextBoolean(), new Random().nextBoolean(), true));
            } else if (os.contains("Windows")) {
                // Windows users get all the generic bitches, how lame!
                this.allMyBitches.add(new Bitch(name, age, race, gender));
            } else if (os.contains("Linux")) {
                // Hold this fucking L "L"inux users
                this.allMyBitches.add(new EmoBitch(new Random().nextBoolean(), new Random().nextBoolean()));
            }

            System.out.println("New Bitch: " + this.allMyBitches.get(i).toString());
        }
    }

    public static void main(String[] args) {
        new StartGivingBitches();
    }
}
