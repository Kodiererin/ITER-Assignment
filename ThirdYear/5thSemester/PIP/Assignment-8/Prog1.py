def intToString(a):
    if a//10==0:
        return (str) a
    else
        return (str)a%10+intToString(a%10)


print(intToString(1234))
