# 18. Write a function to multiply two non-negative numbers by repeated addition, for example, 7*5 =
# 7+7+7+7+7.


def multiply(x,y):
    if x<0 or y<0:
        return -1
    else:
        i = 1
        sum=0
        while(i<=y):
            sum+=x
            print(sum)
            i+=1
        return sum


multiply(7,5)