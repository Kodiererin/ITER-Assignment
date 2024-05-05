# Plot the Normal PDFs using various value of µ and σ as mentioned below:
# µ σ
# 0 1
# 0 2
# 0 0.5
# -1 1
# Use different line styles for each plot and compare the graphs thus obtained. You can use any range
# for x-axis.

import numpy as np
import matplotlib.pyplot as plt

parameters = [(0, 1), (0, 2), (0, 0.5), (-1, 1)]
x = np.linspace(-5, 5, 1000)

for mu, sigma in parameters:
    y = 1/(sigma * np.sqrt(2 * np.pi)) * np.exp(-(x - mu)**2 / (2 * sigma**2))
    plt.plot(x, y, label=f"µ={mu}, σ={sigma}")

plt.legend()
plt.xlabel('x')
plt.ylabel('Probability Density')
plt.title('Normal Probability Density Functions')
plt.grid(True)
plt.show()
