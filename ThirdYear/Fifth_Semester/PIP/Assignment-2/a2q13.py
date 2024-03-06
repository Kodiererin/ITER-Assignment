# 13. Write a function which takes co-ordinates of three points as input and returns true if points are
# collinear otherwise returns false

def checkCollinear(x,y,a,b,p,q):
    if((a-x)/b-y == (p-x)/q-y):
        return "Collinear"
    else:
        return "not Collinear"


print(checkCollinear(int(input("Enter X ")),int(input("Enter Y ")),int(input("Enter A ")),int(input("Enter B ")),int(input("Enter P ")),int(input("Enter Q "))))
