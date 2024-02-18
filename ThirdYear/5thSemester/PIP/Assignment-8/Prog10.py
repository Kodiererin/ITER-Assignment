def printIncreasing(n):
    if(n//10==0):
        return n
    else:
        return n%10+ printIncreasing(n//10)*10


print(printNum(1234))
