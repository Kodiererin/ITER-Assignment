# Write a Python program to find the point of minima of function using Gradient Descent method taking
# initial solution x0 = 2.f(x) = x2 + sin(x)


import math
def f(x: float) -> float:
    return x**2 + math.sin(x)
def derivative_f(x: float) -> float:
    return 2 * x + math.cos(x)
def gradient_descent(func: callable, derivative_func: callable, x0: float, learning_rate: float, num_iterations: int) -> float:
    x = x0
    for _ in range(num_iterations):
        x -= learning_rate * derivative_func(x)
    return x
def main() -> None:
    x0: float = 2.0
    learning_rate: float = 0.1
    num_iterations: int = 1000
    minima_point: float = gradient_descent(f, derivative_f, x0, learning_rate, num_iterations)
    print("Point of minima using Gradient Descent method:", minima_point)

if __name__ == "__main__":
    main()