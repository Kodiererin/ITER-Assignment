# 7. We have defined the function normal cdf. Write a program to invert normal cdf to find the value
# corresponding to a specified probability.

import math


def normal_cdf(x, mu=0, sigma=1):
    return (1 + math.erf((x - mu) / (sigma * math.sqrt(2)))) / 2


def inverse_normal_cdf(probability, mu=0, sigma=1, tolerance=0.0001):
    if probability < 0 or probability > 1:
        return None

    low = mu - 10 * sigma
    high = mu + 10 * sigma
    while high - low > tolerance:
        mid = (low + high) / 2
        if normal_cdf(mid, mu, sigma) < probability:
            low = mid
        else:
            high = mid
    return mid


def main():
    probability = float(input("Enter the probability (between 0 and 1): "))
    mu = float(input("Enter the mean (mu) of the normal distribution: "))
    sigma = float(input("Enter the standard deviation (sigma) of the normal distribution: "))
    value = inverse_normal_cdf(probability, mu, sigma)
    if value is not None:
        print("Value corresponding to probability {} is: {:.4f}".format(probability, value))
    else:
        print("Invalid probability. Please enter a probability between 0 and 1.")


if __name__ == "__main__":
    main()
