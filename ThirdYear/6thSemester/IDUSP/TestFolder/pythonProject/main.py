# You can code here!


# Truthiness
# Truthy values
print(bool(42))        # Output: True
print(bool(3.14))      # Output: True
print(bool([1, 2, 3])) # Output: True
print(bool("hello"))   # Output: True

# Falsy values
print(bool(0))         # Output: False
print(bool(0.0))       # Output: False
print(bool([]))        # Output: False
print(bool(""))        # Output: False



# Using Counters
from collections import Counter

a = Counter([1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4])

print(a.most_common(10))

aa=[1,2,3,4,5,6,7,8,9]
for _ in aa:
    print(_ , end=',')


try:
    print(0/0)
except Exception as e:
    print(e)



def getResult(x:int,y:int)->float:
    return x/y


print(getResult(2,3))
# print(getResult("Ujjwal","Kumar")) error
# print(getResult('x','y'))  error
print(getResult(10.1,20.1))


test =  lambda x: x*x
print(test(10))




def test():
    x = [i for j in range(10) for i in range(j)]
    print(x)

test()