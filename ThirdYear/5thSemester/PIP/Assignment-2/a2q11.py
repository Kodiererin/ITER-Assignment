# 11. Using a Function evaluate the value ofarithmetic expression taken from the user

def evaluate(expr):
    result = eval(expr)
    print(result)

def main():
    expr = input("Enter The Expression ")
    evaluate(expr)

if __name__ =="__main__":
    main()
