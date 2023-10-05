# 4. Consider the following function:
# def nMultiple(a = 0, num = 1):
# return a*num
# What will be the output produced when the following calls are made:
# a. nMultiple(5)
# b. nMultiple(5,6)
# c. nMultiple(num = 7)
# d. nMultiple(num = 6, a = 5)
# e. nMultiple(5, num = 6)


def nMultiple(a=0, num=1):
    return a*num;


print(nMultiple(5))
print(nMultiple(5,6))
print(nMultiple(7))
print(nMultiple(num=6 , a =5 ))
print(nMultiple(5,num=6))