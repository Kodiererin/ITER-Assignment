# 9. Write a program to find the maximum of three numbers using a nested function.



def max(x,y):
	if x>y:
		return x
	else:
		return y

def main():
	x,y,z = int(input("Enter Number \n ")) , int(input("Enter Number \n ")),int(input("Enter Number \n "))
	print(max(max(x,y),z))
	

main()
