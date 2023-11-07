def anagrams(x,y):
    x = x.lower()
    y = y.lower()
    if len(x)==len(y):
        for i in range(len(x)):
            flag=0
            if x[i] in y:
            	flag=1
            else:
                return False
        return True if flag==1 else False


print(anagrams("evil","live"))
