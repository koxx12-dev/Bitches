from obj.Bitch import Bitch


class CyberBitch(Bitch):
    def __init__(self, name: str, age: int, pcType: str, gay: bool):
        super().__init__(name, age)
        self.pcType = pcType
        self.gay = gay
