package gq.noxiuam.bitches.object;

import com.github.javafaker.Faker;
import gq.noxiuam.bitches.Main;
import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.*;

import java.util.Random;

/*
    Generic bitch, nothing special to them.
*/
@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class Bitch {

    private String name;
    private int age;
    private Race race;
    private Gender gender;

    /*
        Age is always above 18 so that it's legal to have them...
        NOTE: Name and gender may not match up, they might be transgender, or just mis-named at birth!
    */
    public void build() {
        this.setName(new Faker().name().firstName());
        this.setAge(Main.random.nextInt(30) + 18);
        this.setRace(Race.values()[Main.random.nextInt(Race.values().length)]);
        this.setGender(Gender.values()[Main.random.nextInt(Gender.values().length)]);
    }

}