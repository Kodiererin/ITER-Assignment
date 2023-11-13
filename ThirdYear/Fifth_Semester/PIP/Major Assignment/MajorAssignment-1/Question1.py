
# 1. Write a program that converts a binary (base 2) number to a decimal (base 10). Your program should
# begin by reading the binary number from the user as a string. Then, it should compute the equivalent
# decimal number by processing each digit in the binary number. Finally, your program should display
# the equivalent decimal number with an appropriate message


def binaryToDecimal(binaryNo):
    decimalValue = 0
    power = len(binaryNo)
    for i in binaryNo:
        if i=='1':
            decimalValue = decimalValue + 2 **power
        power = power-1
    return decimalValue


def main():
    print(binaryToDecimal(input("Enter a Binary Number : ")))


if __name__ == '__main__':
    main()