# Question 3 : Find the Sum of the series



def series(x):
    sum = 0
    n=0
    i=0
    while i<pow(x,n):
        sum = sum+data(x,i)
        i+=2
    return sum

def data(x,i):
    return pow(x,i)/fact(i)

def fact(x):
    i=1
    sum = 1
    while(i<x):
        sum = sum*i
    return sum

print(series(10))
