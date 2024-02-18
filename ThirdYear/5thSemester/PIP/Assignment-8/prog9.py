def multiply(a,b):
    if(b==1):
        return a
    else:
        return a+multiply(a,b-1)

print(multiply(3,3))
