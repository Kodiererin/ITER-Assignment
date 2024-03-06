# 10. Find the sum of even digits of a four-digit number using function.
# Warning: Don’t use control structures.

def sumFour():
    x = int(input("Enter the Four Digit Number"))

    a = int(x / 1000)
    b = int((x % 1000) / 100)
    c = int((x % 100) / 10)
    d = int((x % 100) % 10)
    print("The Sum of Digits = ", (a + b + c + d))

sumFour()

