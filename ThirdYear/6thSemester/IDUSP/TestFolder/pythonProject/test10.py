import matplotlib.pyplot as plt
import math
import random

# Parameters
n = 100
p = 0.75
num_points = 100

# Generate binomial samples
binomial_samples = []
for _ in range(num_points):
    successes = sum(1 for _ in range(n) if random.random() < p)
    binomial_samples.append(successes)

# Generate points for normal approximation
normal_approximation = []
for k in range(n + 1):
    prob = (math.factorial(n) / (math.factorial(k) * math.factorial(n - k))) * (p ** k) * ((1 - p) ** (n - k))
    normal_approximation.append(prob * num_points)  # Scaling for visualization purposes

# Plot histogram of binomial samples
plt.hist(binomial_samples, bins=range(n+1), alpha=0.5, label='Binomial Samples')

# Plot line chart for normal approximation
plt.plot(range(n + 1), normal_approximation, color='red', label='Normal Approximation')

# Add labels and legend
plt.title('Binomial Distribution vs. Normal Approximation')
plt.xlabel('Number of Successes')
plt.ylabel('Frequency / Probability Density')
plt.legend()

# Show plot
plt.show()
