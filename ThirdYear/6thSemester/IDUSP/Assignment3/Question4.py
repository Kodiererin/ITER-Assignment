# Write a Python program to find the point of minima of Rosenbrock function using Gradient Descent
# method taking initial solution (0,0). Rosenbrock function is defined below.
# f(x, y) = (1 − x)2 + (y − x2)2


def rosenbrock_function(x: float, y: float) -> float:
    return (1 - x)**2 + (y - x**2)**2
def partial_derivative_x(x: float, y: float) -> float:
    return -2 * (1 - x) - 4 * x * (y - x**2)
def partial_derivative_y(x: float, y: float) -> float:
    return 2 * (y - x**2)
def gradient_descent(func: callable, partial_derivative_x: callable, partial_derivative_y: callable,
                     initial_point: tuple, learning_rate: float, num_iterations: int) -> tuple:
    x, y = initial_point
    for _ in range(num_iterations):
        gradient_x = partial_derivative_x(x, y)
        gradient_y = partial_derivative_y(x, y)
        x -= learning_rate * gradient_x
        y -= learning_rate * gradient_y
    return x, y

def main() -> None:
    initial_point: tuple = (0, 0)
    learning_rate: float = 0.001
    num_iterations: int = 1000
    minima_point: tuple = gradient_descent(rosenbrock_function, partial_derivative_x, partial_derivative_y,
                                            initial_point, learning_rate, num_iterations)
    print("Point of minima using Gradient Descent method:", minima_point)

if __name__ == "__main__":
    main()
