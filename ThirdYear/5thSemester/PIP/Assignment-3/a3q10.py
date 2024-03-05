
# WAF that takes 2 Numbers and return LCM.
# Problem in the code.

def LCM(x, y):
    i = 1
    while i <= x * y:
        if i % x == 0 and i % y == 0:
            return i
        i += 1

def main():
    x,y = int(input("Enter A Number")) , int(input("Enter A Number"))
    print('LCM is ',LCM(x,y))

main()
