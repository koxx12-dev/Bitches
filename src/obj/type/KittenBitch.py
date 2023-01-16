from obj.Bitch import Bitch


class KittenBitch(Bitch):
    def __init__(self, name: str, age: int, doesAsTheyAreTold: bool, twitterUser: bool):
        super().__init__(name, age)
        self.doesAsTheyAreTold = doesAsTheyAreTold
        self.twitterUser = twitterUser
        
        if self.twitterUser:
            self.twitterUsername = 'Noxiuam'
