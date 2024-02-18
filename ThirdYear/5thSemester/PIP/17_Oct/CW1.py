def checkPrime(n):
    flag = 0
    if n==0 or n==1:
        flag=1
    else:
        for i in range(2,n):
            if n%1==0:
                flag=1
            else:
                flag=0
        return flag

def checkPrime_while(n):
    flag = 0
    if n==0 or n==1:
        flag=1
    else:
        i=2
        while(i<n):
            if n%1==0:
                flag=1
            else:
                flag=0
            i=i+1
        return flag

def main():
    n = int(input("Enter A Number "))
    res = checkPrime(n)
    res2 = checkPrime_while(n)
    if res==1:
        print("Prime Number ")
    else:
        print("Nota prime Number")

if __name__=='__main__':
    main()
