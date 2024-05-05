# Write a Python program to find gradient of Rosenbrock function using limit of the difference coeffficient method at the point (1,2). Rosenbrock function is defined below.
# f(x, y) = (1 − x)2 + 100(y − x2)2


def rosenbrock_function(x: float, y: float) -> float:
    return (1 - x)**2 + 100 * (y - x**2)**2
def partial_derivative(func: callable, var: int, point: tuple, h: float = 1e-6) -> float:
    x, y = point
    if var == 0:
        return (func(x + h, y) - func(x, y)) / h
    elif var == 1:
        return (func(x, y + h) - func(x, y)) / h
    else:
        raise ValueError("Invalid variable index. Only 0 and 1 are allowed.")
def gradient(func: callable, point: tuple, h: float = 1e-6) -> tuple:
    return (partial_derivative(func, 0, point, h), partial_derivative(func, 1, point, h))
def main() -> None:
    point = (1, 2)
    gradient_at_point = gradient(rosenbrock_function, point)
    print("Gradient of Rosenbrock function at point (1, 2):", gradient_at_point)

if __name__ == "__main__":
    main()
