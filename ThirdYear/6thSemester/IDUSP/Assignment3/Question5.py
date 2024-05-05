#  Let X be a binomial random variable with parameters n = 100 and p = 0.6. Write a Python program
# to find the approximate probability that:
# 1. X lies above 60.
# 2. X lies between 50 and 70.
# using normal approximation to binomial distribution.

import math


def binomial_normal_approx(n: int, p: float, x: int) -> float:
    mu = n * p
    sigma = math.sqrt(n * p * (1 - p))
    z = (x + 0.5 - mu) / sigma
    return 0.5 * (1 + math.erf(z / math.sqrt(2)))


def main() -> None:
    n: int = 100
    p: float = 0.6
    x1: int = 60
    x2_start: int = 50
    x2_end: int = 70

    # Probability that X lies above 60
    prob_above_60: float = 1 - binomial_normal_approx(n, p, x1)
    print("Approximate probability that X lies above 60:", prob_above_60)

    # Probability that X lies between 50 and 70
    prob_between_50_and_70: float = binomial_normal_approx(n, p, x2_end) - binomial_normal_approx(n, p, x2_start - 1)
    print("Approximate probability that X lies between 50 and 70:", prob_between_50_and_70)


if __name__ == "__main__":
    main()
