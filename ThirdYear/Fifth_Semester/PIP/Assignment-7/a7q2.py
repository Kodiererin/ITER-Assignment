def sumIndex(x):
    i=1
    while (i in range(len(x))):
        x[i]=x[i]+x[i-1]
        i=i+1

    return x

x=[1,2,3,4,5]
print(sumIndex(x))