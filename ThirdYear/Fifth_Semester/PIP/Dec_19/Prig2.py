# To find the reverse of a String

def reverse(a):
    if(a==''):
        return a
    else:
        return a[-1]+reverse(a[:-1])

print(reverse(input("Enter A String :")))
