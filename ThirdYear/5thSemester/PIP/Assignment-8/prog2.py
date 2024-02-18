def linearSum(a,i,s):
    if(i<len(a)):
        s= s+a[i]
        linearSum(a,i+1,s)
    else:
        print(s)

def binarySum(a,i,j):
    if(i>j):
        return 0
    if(i==j and i>-1 and j<len(a)):
        return a[i]
    else:
         mid = (i+j)//2
         return binarySum(a,i,mid)+binarySum(a,mid+1,j)


def main():
    a=[1,2,3,4]
    linearSum(a,0,0)
    print(binarySum(a,0,len(a)-1))


main()
