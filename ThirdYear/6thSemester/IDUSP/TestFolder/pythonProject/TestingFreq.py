animal_names = ["dog", "cat", "dog", "rabbit", "cat", "elephant", "rabbit", "lion", "dog", "lion"]

print("Array with duplicate animal names:", animal_names)


from collections import Counter

x = Counter(animal_names)
print(x)
y = Counter.most_common(x)
print(y)
yDash  = sorted(y, key=lambda x: x[1], reverse=True)
print(yDash)
z = Counter.items(x)
print(z)

print(x.items())


from collections import defaultdict

x = defaultdict()

for i in range(10):
    x.setdefault(i)

print(x)