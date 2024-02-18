# Let us consider there are 2 list 1st list contains registration no of 5 students.
# Second list contains name of 5 students.

# WAPS to create student attendence sheet by using 2 list

a = ['Sohan', 'Mohan' , 'Rohan']
b = [90,99,95]

c = {}

for i in range(min(len(a),len(b))):
    c[a[i]] = b[i]

print(c)


list3 = list(zip(a,b))
print(list3)

