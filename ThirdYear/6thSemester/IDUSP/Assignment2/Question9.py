# 9. Do the same as above question for Normal CDFs using the same values of µ and σ.

import numpy as np
import matplotlib.pyplot as plt

# Define parameters µ and σ for each plot
parameters = [(0, 1), (0, 2), (0, 0.5), (-1, 1)]

# Define x range
x = np.linspace(-5, 5, 1000)

# Plot each normal CDF
for mu, sigma in parameters:
    y = 0.5 * (1 + np.erf((x - mu) / (sigma * np.sqrt(2))))
    plt.plot(x, y, label=f"µ={mu}, σ={sigma}")

# Add legend and labels
plt.legend()
plt.xlabel('x')
plt.ylabel('Cumulative Probability')
plt.title('Normal Cumulative Distribution Functions')
plt.grid(True)
plt.show()
