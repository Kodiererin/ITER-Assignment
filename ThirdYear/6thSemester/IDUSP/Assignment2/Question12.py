# 12. Using the Binomial(n, p) distribution plot a histogram to show the actual binomial samples. Use a
# line chart to show the normal approximation. Plot both in the same graph. Take n=100, p=0.75 and
# number of points should be 100.
import matplotlib.pyplot as plt

# Binomial distribution function
def binomial_pmf(n, p, k):
    return (factorial(n) / (factorial(k) * factorial(n - k))) * (p ** k) * ((1 - p) ** (n - k))

# Factorial function
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

# Normal approximation function
def normal_pdf(x, mu, sigma):
    return (1 / (sigma * (2 * 3.14159) ** 0.5)) * 2.71828 ** ((-(x - mu) ** 2) / (2 * sigma ** 2))

# Parameters
n = 100
p = 0.75

# Generate Binomial samples
binomial_samples = [binomial_pmf(n, p, k) for k in range(n + 1)]

# Generate normal approximation
mu = n * p
sigma = (n * p * (1 - p)) ** 0.5
x = [i for i in range(n + 1)]
normal_approximation = [normal_pdf(i, mu, sigma) for i in range(n + 1)]

# Plot both in the same graph
plt.plot(x, binomial_samples, label='Binomial Samples')
plt.plot(x, normal_approximation, 'r--', label='Normal Approximation')

# Add labels and legend
plt.xlabel('X')
plt.ylabel('Probability')
plt.title('Binomial Distribution vs. Normal Approximation')
plt.legend()
plt.grid(True)
plt.show()
