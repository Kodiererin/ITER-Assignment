def getData(data):
    m=[]
    for i in range(len(data)):
        if data[i] not in m:
            m.append(data[i])
    return m

x=[1,2,1,1,1,2,4,5,6,7]
print(getData(x))