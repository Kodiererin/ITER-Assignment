
# using random function

import random

print(random.choice([10,20,30,40]))
print(random.shuffle([10,20,30,40]))

print(random.randrange(1,10))
print(random.randint(10,30))

for i in range(5):
    random.seed(123)
    print(random.randint(1,124))

pairs = [('a', 1), ('b', 2), ('c', 3)]
letters, numbers = zip(*pairs)

print(letters)
print(numbers)

print([i for i,j in pairs])