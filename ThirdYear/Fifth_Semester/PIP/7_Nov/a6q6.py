def printSTR(x):
    print(len(x))
    print(x[17:-1])
    print(x[-len(x) : len(x)])
    print(x[:-12] + x[-12:])
    print(x.find('delh'))
    print(x.swapcase())
    print(x.split(','))
    print(x.isalpha())

printSTR('B-6 Lodhi read ,Delhi')
