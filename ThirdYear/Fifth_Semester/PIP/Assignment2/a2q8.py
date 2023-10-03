# Print the table of the Number N

def printTable(ctr,n):
    if ctr>=10:
        return
    else:
        ctr+=1
        print(n,"\tX\t",ctr,"\t=\t",ctr*n)
        printTable(ctr,n)


def main():
	n = int(input("Enter The Value of N : "))
	printTable(0,n)
	
if(__name__=='__main__'):
	main()
