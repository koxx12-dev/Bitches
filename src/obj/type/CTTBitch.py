from obj.Bitch import Bitch


class CTTBitch(Bitch):
    def __init__(self, name: str, age: int, usesFogInVideos: bool, getsPeggedByWoofina: bool, hasAShittyMic: bool):
        super().__init__(name, age)
        self.usesFogInVideos = usesFogInVideos
        self.getsPeggedByWoofina = getsPeggedByWoofina
        self.hasAShittyMic = hasAShittyMic
