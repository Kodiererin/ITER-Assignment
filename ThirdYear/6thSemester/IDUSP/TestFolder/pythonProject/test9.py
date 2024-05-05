# a  = [[i+j for  i in range(4)] for j in range(4)]
# print(a)

# Creating the first 2D array
# array1 = [
#     [1, 2, 3],
#     [4, 5, 6],
#     [7, 8, 9]
# ]
#
# # Creating the second 2D array
# array2 = [
#     [9, 8, 7],
#     [6, 5, 4],
#     [3, 2, 1]
# ]
#
#
# c = [[(array2[i][j]+array1[i][j])/2 for i in range(len(array1))] for j in range(len(array1))]
# print(c)

import random

c = []

for _ in range(100):
    c.append(random.randint(1,100))


from collections import  Counter

data = Counter(c)

from matplotlib import pyplot as plt

plt.hist(list(data.keys()),len(list(data.values())))
plt.show()