class Bitch:
    def __init__(self, name: str, age: int):
        self.name = name
        self.age = age
    
    def getName(self):
        return self.name
    
    def getAge(self):
        return self.age

    def setName(self, newName: str):
        self.name = newName
    
    def setAge(self, newAge: int):
        self.age = newAge
