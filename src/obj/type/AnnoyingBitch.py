from obj.Bitch import Bitch


class AnnoyingBitch(Bitch):
    def __init__(self, name: str, age: int, annoyingLevel: int, pregnant: bool, fatherless: bool):
        super().__init__(name, age)
        self.annoyingLevel = annoyingLevel
        self.pregnant = pregnant
        self.fatherless = fatherless
