#Assignment - 7

# Question 3

# Count the frequency of each Digit in String.

x = input("Enter The String ")

def countFreq(x):
    c={}
    for i in range(len(x)):
        if x[i] in c.keys():
            c[x[i]] = c.get(x[i])+1
        else:
            c[x[i]] = 1
        
    print(c)


# Without using dictionaries

def countFreqUsingString(x):
    for i in range(len(x)):
        print(x[i] , 'occurs' , x.count(x[i]) , 'times')




countFreq(x)
countFreqUsingString(x)

