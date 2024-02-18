# First letter of Every word to uppercase

def upfirWord(x):
    x=x.replace(x[0],x[0].upper())
    for i in range(len(x)):
        if x[i]==' ' and x[i+1].islower() or x[i]==' ' and x[i]!=' ':
            x = x.replace(x[i+1],x[i+1].upper(),1)
            i=i+1

    print(x)

upfirWord("Hello World I am Ujjwal")
