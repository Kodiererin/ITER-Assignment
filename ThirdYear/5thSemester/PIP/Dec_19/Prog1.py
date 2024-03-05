# Length of a String using Recursion

def strLength(a):
    if(a==''):
        return 0
    else:
        return 1+strLength(a[1:])

def main():
    print("The String Length is ",strLength(input("Enter a String : ")))




if __name__=="__main__":
    main()
