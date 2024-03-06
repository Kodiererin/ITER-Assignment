# What does a function by Default in python?
# Define a function that does ot return any value store the function call in a variable and checl the value of the Variable


a = 0

def insertValue(n):
    a = n;

def main():
    insertValue(10)
    print(a)


if __name__=="__main__":
    main()
    print(main())
