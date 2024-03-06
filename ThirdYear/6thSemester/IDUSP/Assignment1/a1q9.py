# 9. Plot xsinx, x
# 2
# sinx , x
# 3
# sinx and x
# 4
# sinx in a single plot in the range x ∈ [−10, 10].


import matplotlib.pyplot as plt
from math import sin

x = []
for i in range(-100, 101):
    x.append(i / 10)

y1 = [a * b for a, b in zip(x, [sin(x_val) for x_val in x])]
y2 = [a**2 * b for a, b in zip(x, [sin(x_val) for x_val in x])]
y3 = [a**3 * b for a, b in zip(x, [sin(x_val) for x_val in x])]
y4 = [a**4 * b for a, b in zip(x, [sin(x_val) for x_val in x])]

plt.plot(x, y1, label='$x\sin(x)$')
plt.plot(x, y2, label='$x^2\sin(x)$')
plt.plot(x, y3, label='$x^3\sin(x)$')
plt.plot(x, y4, label='$x^4\sin(x)$')

plt.xlabel('x')
plt.ylabel('y')
plt.title('Plots of $x\sin(x)$, $x^2\sin(x)$, $x^3\sin(x)$, and $x^4\sin(x)$')
plt.legend()

plt.grid(True)
plt.show()
