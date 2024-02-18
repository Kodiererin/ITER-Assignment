def multiple(x):
    a=[]
    print(type(a))
    for i in range(x):
        a.append([])
    for i in range(x):
        for j in range(5):
            a[i].append(i*j)

    print(a)

multiple(5)