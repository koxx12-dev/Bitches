from obj.Bitch import Bitch


class WaifuBitch(Bitch):
    def __init__(self, name: str, age: int, wifeMaterial: bool, sexualNicknames, favoriteAnime: str):
        super().__init__(name, age)
        self.wifeMaterial = wifeMaterial
        self.sexualNicknames = sexualNicknames
        self.favoriteAnime = favoriteAnime
