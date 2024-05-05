from matplotlib import pyplot as plt
from collections import  Counter

a = input("Enter a Words")
# a = a.split('')
a = Counter(a)

print(a)
plt.plot(list(a.keys()), list(a.values()))
plt.plot()
plt.show()