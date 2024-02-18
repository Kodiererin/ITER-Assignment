def freqDict(x):
    m={}
    for i in range(len(x)):
        if x[i] not in m:
           m[x[i]]=1
        else:
            m[x[i]] = m[x[i]]+1
    print(m)


freqDict("ujjwal")