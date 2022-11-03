package gq.noxiuam.bitches.`object`

import com.github.javafaker.Faker
import gq.noxiuam.bitches.Main
import gq.noxiuam.bitches.`object`.data.Gender
import gq.noxiuam.bitches.`object`.data.Race
import lombok.*

/*
    Generic bitch, nothing special to them.
*/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
open class Bitch {
    var name: String? = null
    var age = 0
    var race: Race? = null
    var gender: Gender? = null

    constructor(name: String, age: Int, race: Race, gender: Gender) {
        this.name = name
        this.age = age
        this.race = race
        this.gender = gender
    }

    constructor()

    /*
        Age is always above 18 so that it's legal to have them...
        NOTE: Name and gender may not match up, they might be transgender, or just mis-named at birth!
    */
    fun build() {
        this.name = Faker().name().firstName()
        this.age = Main.random.nextInt(30) + 18
        this.race = Race.values()[Main.random.nextInt(Race.values().size)]
        this.gender = Gender.values()[Main.random.nextInt(Gender.values().size)]
    }
}