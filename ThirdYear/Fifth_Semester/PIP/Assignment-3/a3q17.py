# 17. Write a function that takes two numbers as input parameters and returns True or False depending on
# whether they are co-primes. Two numbers are said to be co-prime if they do not have any common
# divisor other than one.

def coPrimes(x,y):
    i=2
    while(i<min(x,y)):
        if(x%i==0 and y%i==0):
            return False
        i=i+1
    return True


print(coPrimes(21,31))