def getData():
    str = input("Enter the String ")
    str1 = ''
    for i in range(len(str)-1):
        if str[i]==str[i+1]:
            str1 = str1+'*'
        else:
            str1 = str1+str[i]
    str1 = str1+str[i+1]
    print(str1)

getData()
