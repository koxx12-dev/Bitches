from obj.Bitch import Bitch


class FemboyBitch(Bitch):
    def __init__(self, name: str, age: int, hot: bool, thiccthighs: bool):
        super().__init__(name, age)
        self.hot = hot
        self.thiccthighs = thiccthighs
