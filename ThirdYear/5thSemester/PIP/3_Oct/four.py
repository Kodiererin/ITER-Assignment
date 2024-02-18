
import math

def findArea(side1 , side2 , side3):
    s = (side1+side2+side3)/2
    print(s)
    b = int(s*(s-side1)*(s-side2)*(s-side3))
    print(b)
    myArea =  float(math.sqrt(b))
    print(myArea)
    return myArea


def testArea():
    a,b,c = int(input("Enter Side 1 ")),int(input("Enter Side 2 ")),int(input("Enter Side 3 "))
    print("The Sides Are ",a," ",b," ",c)
    assert a+b>c and b+c>a and a+c>b

    area = findArea(a,b,c)
    print("The Area of Triangle is ",area)


testArea()

if __name__=='__main__':
    main()
