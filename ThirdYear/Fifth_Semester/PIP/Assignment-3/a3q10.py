
# WAF that takes 2 Numbers and return LCM.
# Problem in the code.

def LCM(x,y):
    i=1
    j=1
    while i<x*y:
       if i<j:
           i=i+1
           if x*i == y*j :
               return x*i
           elif i>j:
                j=j+1
                if x*i == y*j:
                    return x*i
       else:
            if x*i==y*j:
                return x*i
            else:
                i=i+1
                j=j+1

def main():
    x,y = int(input("Enter A Number")) , int(input("Enter A Number"))
    print('LCM is ',LCM(x,y))

main()
