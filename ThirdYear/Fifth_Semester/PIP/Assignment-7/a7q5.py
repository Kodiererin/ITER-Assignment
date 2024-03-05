def a():
    c = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    result = 0
    for i in range(0, 10):
        if (c[i] % 2 == 0):
            result += c[i]
    print(result)

a()
print()


def b():
    c = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    result = 0
    for i in range(0, 10):
        if (c[i] % 2 != 0):
            result += c[i]
    print(result)

b()
print()

def c():
    quantity = [15, 30, 12, 34, 56, 99]
    total = 0
    for i in range(0, len(quantity)):
        if (quantity[i] > 15):
            total += quantity[i]
    print(total)

c()
print()


def d():
    subject = 'computer'
    subject = list(subject)
    ch = subject[0]
    for i in range(0, len(subject) - 1):
        subject[i] = subject[i + 1]
    subject[len(subject) - 1] = ch
    print(''.join(subject))

d()