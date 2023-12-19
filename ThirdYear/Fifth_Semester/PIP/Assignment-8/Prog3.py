# Count the power of a,b using recursion

def countPower(a,b):
    if(b==1):
        return a
    return a*countPower(a,b-1)

print(countPower(2,3))
