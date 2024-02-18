


def func(a=0,b=1):
    return (a**2 + b**2)

def main():
    # print(func(2,a=3)) TypeError: func() got multiple values for argument 'a'
    # print(func(b=3,2))  This Will Throw an error : Positional argument follows keyword argument
    print(func(3,b=2))
    # print(func(a=4,5))    SyntaxError: positional argument follows keyword argument


if __name__=="__main__":
    main()
