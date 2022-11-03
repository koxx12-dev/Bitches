class Bitch {

    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    getName() {
        return this.name;
    }

    getAge() {
        return this.age;
    }

    setName(newName) {
        this.name = newName;
    }

    setAge(newAge) {
        this.age = newAge;
    }

}

module.exports.Bitch = Bitch;