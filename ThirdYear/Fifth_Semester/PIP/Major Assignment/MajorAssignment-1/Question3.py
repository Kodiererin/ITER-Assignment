# Name : UJJWAL KUMAR
# Registration Number : 2141011063
# Section : C

# ----------------------- MAJOR ASSIGNMENT - 1 --------------------------------------

# 3. (Arbitrary Base Conversions) Write a program that allows the user to convert a number from one
# base to another. Your program should support bases between 2 and 16 for both the input number
# and the result number. If the user chooses a base outside of this range then an appropriate error
# message should be displayed and the program should exit. Divide your program into several functions,
# including a function that converts from an arbitrary base to base 10, a function that converts from base
# 10 to an arbitrary base, and a main program that reads the bases and input number from the user.

def base2decimal(num,base):
    if int(num)<2 or int(base)>16:
        return ValueError("Invalid Base")
    else:
        deciVal = 0
        power = len(num)-1
        for i in num:
            if i.upper() not in "0123456789ABCDEF" or int(i, base) >= int(base):
                raise ValueError("Invalid Digit")
            deciVal = deciVal + int(i, base) * base ** power
            power  = power-1

        return deciVal

# print(base2decimal("100",12))


def deci2arbBase(decimalInteger,base):
    if int(base)<2 or int(base)>16:
        raise ValueError("Invalid Base")
    if int(decimalInteger) == 0:
        return "0"

    bDigits = "0123456789ABCDEF"
    convNum = ""

    x = int(decimalInteger)
    y = int(base)
    while x>0:
        rem = x%y
        convNum = convNum+bDigits[rem]
        x = x//y

    return convNum[::-1]



def main():
    print("The Converted Decimal  Number is ",base2decimal(input("Enter the Number that you want to convert to Decimal : "),int(input("Enter the Base of the Number"))))
    print("The Converted Number is at the Entered Base is  ", deci2arbBase(input("Enter the Decimal Number  : "),int( input("Enter the Base of the Number that you want to convert "))))



if __name__=='__main__':
    main()