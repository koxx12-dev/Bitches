package gq.noxiuam.bitches;

import com.github.javafaker.Faker;
import gq.noxiuam.bitches.object.data.PCType;
import gq.noxiuam.bitches.object.type.AnnoyingBitch;
import gq.noxiuam.bitches.object.Bitch;
import gq.noxiuam.bitches.object.type.CTTBitch;
import gq.noxiuam.bitches.object.type.special.Woofina;
import gq.noxiuam.bitches.object.type.CyberBitch;
import gq.noxiuam.bitches.object.type.EmoBitch;
import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    // Make it public so I can get more matches with bitches on Tinder!
    public final List<Bitch> allMyBitches = new ArrayList<>();

    @SneakyThrows
    public Main() {
        String os = System.getProperty("os.name");
        String homeDir = System.getProperty("user.home");
        String appData = System.getenv("APPDATA");
        
        // Gives me more bitches, no one should ever have more than 100 though!
        for (int i = 0; i < new Random().nextInt(100); i++) {
            // Everyone needs a Woofina in their life right? I sure do :plead:
            this.allMyBitches.add(new Woofina(true, Integer.MAX_VALUE, Integer.MAX_VALUE));

            // Define their basic human rights
            String name = new Faker().name().firstName();

            int age = new Random().nextInt(30) + 18;

            Race race = Race.values()[new Random().nextInt(Race.values().length)];
            Gender gender = Gender.values()[new Random().nextInt(Gender.values().length)];
            PCType pcType = PCType.values()[new Random().nextInt(PCType.values().length)];

            if (Files.exists(Path.of(homeDir + "/.lunarclient"))) {
                // Okay Lunar users, I am most definitely not sorry for this one.
                this.allMyBitches.add(new CTTBitch(new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean()));
            } else if (Files.exists(Path.of(appData + "/.feather"))) {
                // Okay Feather users, im sorry to do this to you, but you bought forge, so here is my gift to you.
                this.allMyBitches.add(new CyberBitch(pcType, new Random().nextBoolean()));
            } else if (Files.exists(Path.of("C:\\Program Files\\Badlion Client"))) {
                // I am NOT SORRY, you can deal with the annoying bitch in the back of the class.
                this.allMyBitches.add(new AnnoyingBitch(new Random().nextInt(100), new Random().nextBoolean(), new Random().nextBoolean(), true));
            } else if (os.contains("Windows")) {
                // Windows users get all the generic bitches!
                this.allMyBitches.add(new Bitch(name, age, race, gender));
            } else if (os.contains("Linux")) {
                // Hold this fucking L "L"inux users
                this.allMyBitches.add(new EmoBitch(new Random().nextBoolean(), new Random().nextBoolean()));
            }

            System.out.println("New Bitch: " + this.allMyBitches.get(i).toString());
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
