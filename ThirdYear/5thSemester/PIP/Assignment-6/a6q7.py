# Count the Number of words using Regular Expression.

import re

def countWords(greeting):
    print(greeting.count('Good'))
    print(greeting.find('a'))
    print(greeting.rfind('a'))
    print(greeting.capitalize())
    print(greeting.lower())
    print(greeting.upper())
    print( greeting.swapcase())
    print(greeting.istitle())
    print(greeting.replace('Good', 'Sweet'))
    print(greeting.strip())
    print(greeting.split())
    print(greeting.partition('.'))
    print(greeting.startswith('good'))
    print(greeting.endswith('!!'))


print(countWords("Good Morning. Have a Good Day!!"));
