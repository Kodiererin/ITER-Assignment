# Count the Number of words using Regular Expression.

import re

def countWords(address):
    print(len(address))
    print(address[17:-1])
    print(address[-len(address):len(address)])
    print( address[:-12]+address[-12:])
    print(address.find('delhi'))
    print(address.swapcase())
    print(address.split(','))
    print(address.isalpha())


print(countWords("B-6,LODHI ROAD , DELHI"));
