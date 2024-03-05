# 15. Write a function that returns the sum of digits of a number, passed to it as an argument.

def sumOfDigits(x):
    y = x
    sum = 0
    while(y!=0):
        sum = sum+y%10
        y//=10

    return sum


print(sumOfDigits(121))