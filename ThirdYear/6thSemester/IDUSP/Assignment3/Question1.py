# 1. Write a Python program to find the derivate of using limit of the difference coefficient method at x =
#
# f(x) = ex2+ sin(x) − tan(x) + log(x)
#
#

import math
def f(x: float) -> float:
    return math.exp(x**2) + math.sin(x) - math.tan(x) + math.log(x)
def derivative_at_x(func: callable, x: float, h: float = 1e-6) -> float:
    return (func(x + h) - func(x)) / h
def main() -> None:
    x: float = float(input("Enter the Value of X: "))
    derivative: float = derivative_at_x(f, x)
    print("The derivative of f(x) at x = 1 is:", derivative)

if __name__ == "__main__":
    main()

