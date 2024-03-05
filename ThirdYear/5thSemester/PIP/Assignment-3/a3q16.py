# 16. Write a program that prints Armstrong numbers in the range 1 to 1000. An Armstrong number is a
# number whose sum of the cubes of the cubes of the digits is equal to the number itself. For Example,
# 370 = 33 + 73 + 03


def armStrongNumber(x):
    y = x
    sum = 0
    while (y != 0):
        sum = sum + pow(y % 10,3)
        y //= 10

    return sum==x




def printArmStrongNum():
    for i in range(1000):
        if(armStrongNumber(i)):
            print(i)


printArmStrongNum()