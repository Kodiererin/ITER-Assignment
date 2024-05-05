
# Using type annotation

from typing import List

x: List[float] = []

for i in range(10):
    x.append(float(i))

print(x)



# Calculate Distance between two vectors

from typing import List
import math

vector = List[float]

x : vector = [1,2,3]
y : vector = [10,11,12]

def distance(x:vector , y:vector ) -> float :
    return math.sqrt(sum((i - j) ** 2 for i, j in zip(x, y)))

print(distance(x,y))

