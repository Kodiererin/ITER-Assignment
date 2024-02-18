# Accepts input as a parameter the number of rows and columns

def pattern1(rows , columns):
    k=1
    for i in range(rows+1):
        for j in range(i+1):
            print(k,end='')
        print('\n')
        k=k+1


def pattern2(rows , columns):
    for i in range(columns):
        k = columns-i
        while k>0:
            print('',end=' ')
            k=k-1
        for j in range(i+1):
            print('*',end=' ')
        print('\n')

def pattern3(rows , columns):
    for i in range(columns):
        for j in range(columns-i):
            print(columns-j-i,end=' ')
        print('\n')

def pattern4(rows , columns):
    for i in range(rows):
        for j in range(i):
            print(i,end='')
        print('\n')



def main():
    print('Printing Patterns ')
    pattern1(5,5)
    print('Printing Patterns ')
    pattern2(5,5)
    print('Printing Patterns ')
    pattern3(5,5)
    print('Printing Patterns ')
    pattern4(5,5)
    print('Printing Patterns ')
    pattern5(5,5)
main()
