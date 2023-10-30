# 7. Study the program segments given below. In each case, give the output produced, if any.

# a.
total = 0
count = 20
while count > 5:
    total += count
    count -= 1
print(total)

print("********************************************")

#b.
total = 0
N=5
for i in range(1, N+1):
    for j in range(1, i+1):
        total += 1
print(total)

print("********************************************")

#c.
total = 0
N = 10
for i in range(1, N+1):
    for j in range(1, i+1):
        total += 1
print(total)

print("********************************************")

#d.
total = 0
N=5
for i in range(1, N+1):
    for j in range(1, i+1):
        total += 1
    total -= 1
print(total)

print("********************************************")

#e.
total = 0
N=5
for i in range(1, N+1):
    for j in range(1, N+1):
        total +=i
    print(total)

print("********************************************")

#f.
total = 0
N=5
for i in range(1, N+1):
    for j in range(1, i+1):
        total += j
print(total)

print("********************************************")

#g.
total = 0
N=5
for i in range(1, N+1):
    for j in range(1, N+1):
        total += i+j
print(total)

print("********************************************")

#h.
total = 0
N=5
for i in range(1, N+1):
    for j in range(1, i+1):
        for k in range(1, j+1):
            total += 1
print(total)

print("********************************************")

#i.
number = 72958476
a, b = 0, 0
while (number > 0):
    digit = number % 10
    if(digit % 2 != 0):
            a += digit
    else:
            b += digit
    number /= 10
print(a,b)
