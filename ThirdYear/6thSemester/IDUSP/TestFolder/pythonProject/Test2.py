#
# # Truthiness
#
# print(all([]))
#
# # List Comprehension
# print([i for i in range(10)])
# print([i for j in range(10) for i in range(j)])
#
#
# # Assert Statement
# def calculate_area(length, width):
#     assert length > 0 and width > 0, "Length and width must be positive"
#     return length * width
#
# print(calculate_area(10,2))
# # print(calculate_area(10,0))
# print(any({}))
# print(any([]))
# print(all({}))
#

def test(x):
    while x > 0:
        yield x
        x -= 1  # decrement x inside the loop

# Iterating over the generator properly to extract the values
for j in range(3):
    for i in test(j):  # calling test(3) creates a generator
        print(i,end='')
    print()


my_list = ['apple', 'banana', 'orange', 'grape']

# Using enumerate() in a loop
for index, value in enumerate(my_list):
    print(f"Index: {index}, Value: {value}")




x = [1, 2, 3]
y = [3, 4, 5]
z = []

for i, j in zip(x, y):
    z.append((i, j))

# Now enumerate over z
result = list(enumerate(z))
print(result)



t =[1,2,3,4,5]
print(list(enumerate(t)))