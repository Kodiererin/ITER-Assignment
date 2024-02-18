import pdb

pdb.set_trace()



def max(x,y,z):
    maxNum = 0
    if x>y:
        if y>z:
            maxNum=x
    elif y>z:
        maxNum = y
    else:
        maxNum = z
    return maxNum

def main():
    x = int(input("Enter a Number "))
    y = int(input("Enter a Number "))
    z = int(input("Enter a Number "))
    max3=max(x,y,z)
    print("Maximum = ",max3)


if __name__=='__main__':
    main()
    
