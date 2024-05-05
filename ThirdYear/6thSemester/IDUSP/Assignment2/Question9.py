# 9. Do the same as above question for Normal CDFs using the same values of µ and σ.
import matplotlib.pyplot as plt
import math

# Define parameters µ and σ for each plot
parameters = [(0, 1), (0, 2), (0, 0.5), (-1, 1)]

# Define error function (Gauss error function)
def erf(x):
    return (2 / math.sqrt(math.pi)) * (x - (x ** 3) / 3 + (x ** 5) / 10 - (x ** 7) / 42 + (x ** 9) / 216)

# Define x range
x = [i / 100 for i in range(-500, 501)]

# Plot each normal CDF
for mu, sigma in parameters:
    y = [0.5 * (1 + erf((xi - mu) / (sigma * math.sqrt(2)))) for xi in x]
    plt.plot(x, y, label=f"µ={mu}, σ={sigma}")

# Add legend and labels
plt.legend()
plt.xlabel('x')
plt.ylabel('Cumulative Probability')
plt.title('Normal Cumulative Distribution Functions')
plt.grid(True)
plt.show()
