def harmonicSum(a):
    if(a==0):
        return 1
    else:
        return 1//a + harmonicSum(a-1)


print(harmonicSum(4))
