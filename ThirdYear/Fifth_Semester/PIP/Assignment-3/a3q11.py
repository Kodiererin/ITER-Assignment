# Return the GCD of a Number

def GCD(x,y):
    if x==0:
        print(y)
    else:
        GCD(x%y,x)

def main():
    x = GCD(128,96)


main()
