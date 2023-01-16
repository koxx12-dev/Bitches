import os
from names import get_first_name
from random import getrandbits, randint

from obj.Bitch import Bitch
from obj.type.AnnoyingBitch import AnnoyingBitch
from obj.type.CTTBitch import CTTBitch
from obj.type.CyberBitch import CyberBitch

allMyBitches = []


def main():
    # Check for Lunar, Feather and BadLion installations
    homeDir = os.path.expanduser('~')
    appData = os.getenv('APPDATA')

    hasLunar = os.path.exists(f'{homeDir}\\.lunarclient')
    hasFeather = os.path.exists(f'{appData}\\.feather')
    hasBLC = os.path.exists('C:\\Program Files\\Badlion Client')

    # Generate some bitches
    for x in range(0, randint(1, 100)):
        name = get_first_name()
        age = randint(1, 30) + 1
        
        if hasLunar:
            allMyBitches.append(CTTBitch(name, age, bool(getrandbits(1)), bool(getrandbits(1)), bool(getrandbits(1))))
        elif hasFeather:
            allMyBitches.append(CyberBitch(name, age, 'Prebuilt', bool(getrandbits(1))))
        elif hasBLC:
            allMyBitches.append(AnnoyingBitch(name, age, randint(1, 100), bool(getrandbits(1)), bool(getrandbits(1))))
        else:
            allMyBitches.append(Bitch(name, age))
        
        print(name)


if __name__ == '__main__':
    main()
