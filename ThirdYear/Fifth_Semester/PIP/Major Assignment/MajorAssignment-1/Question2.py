# 2. Write two functions, hex2int and int2hex, that convert between hexadecimal digits (0, 1, 2, 3, 4, 5,
# 6, 7, 8, 9, A, B, C, D, E and F) and decimal (base 10) integers. The hex2int function is responsible
# for converting a string containing a single hexadecimal digit to a base 10 integer, while the int2hex
# function is responsible for converting an integer between 0 and 15 to a single hexadecimal digit. Each
# function will take the value to convert as its only parameter and return the converted value as its only
# result. Ensure that the hex2int function works correctly for both uppercase and lowercase letters.
# Your functions should display a meaningful error message and end the program if the parameter’s
# value is outside of the expected range.

def hex2int(hexDigit):
    x= hexDigit.upper()

    if x not in "0123456789ABCDEF":
        return ValueError("Invalid Hexadecimal Digit")
    hexDigit = "0123456789ABCDEF"
    return hexDigit.index(x.upper())

# print(hex2int("B"))

def int2Hex(digit):
    if(int(digit)<0 or int(digit)>15):
        return "Invald Integer Value"
    else:
        hexDigit = "0123456789ABCDEF"
        return hexDigit[int(digit)]

# print(int2Hex(19))

def main():
    print(hex2int(input("Enter the Hexadecimal no that you want to convert to Integer : ")))
    print(int2Hex(input("Enter the Integer no that you want to convert to  Hexadecimal : ")))


if __name__=='__main__':
    main()
