


def func(a=0,b=1):
    return (a**2 + b**2)

def main():
    print(func(2,a=3))
    print(func(b=3,2))
    print(func(3,b=2))
    print(func(a=4,5))


if __name__=="__main__":
    main()
