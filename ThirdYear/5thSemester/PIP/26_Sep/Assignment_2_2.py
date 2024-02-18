import math

def add(x,y):
    return x+y

print(add(10,20))

for i in range(10):
    print(add(i,i**2))



def counter(x):
    if x==0:
        return
    else:
        print(x)
        counter(x-1)


print("Function with arguments returning None")

def sub(x,y):
    x = print(x-y)
    

print(sub(20,10))

print("print() function return None when executed")


def multiple(a=0,b=1):
    return 5*a;

print(multiple(10))
