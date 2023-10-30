
# 14. Write a function that returns True or False depending on whether the given number is a palindrome.


def palindrome(x):
    y = x
    z = 0
    while(y!=0):
        z = z*10 + +(y%10)
        # z = z*10
        print(z)
        y = y//10

    if x-z==0:
        return True
    else:
        return False


print(palindrome(12321))