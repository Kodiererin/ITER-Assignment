# To find the reverse of a String

def reverse(a):
    if(a==''):
        return a
    else:
        return a[-1]+reverse(a[:-1])

def start():
	a = input("Enter A String :")
	print("IS the String Palindrome ",(a==(reverse(a))))
	
start()
