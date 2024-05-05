# 5. Generate a list of 100 random integers between 1 and 100 and plot a histogram of the same.
import matplotlib.pyplot as plt
import random

# Generate a list of 100 random integers between 1 and 100
random_integers = [random.randint(1, 100) for _ in range(100)]

# Plot histogram
plt.hist(random_integers, bins=20, color='blue', alpha=0.7)
plt.xlabel('Value')
plt.ylabel('Frequency')
plt.title('Histogram of 100 Random Integers')
plt.grid(True)
plt.show()
