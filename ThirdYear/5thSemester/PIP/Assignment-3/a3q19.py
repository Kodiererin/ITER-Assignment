# 19. Write a program that computes the average of a collection of values entered by the user. The user will
# enter 0 as a sentinel value to indicate that no further values will be provided. The program should
# display an appropriate error message if the first value entered by the user is 0


def average():
    ctr=0
    y=0
    x=-1
    while(x!=0):
        x = int(input("Enter the Values "))
        if ctr==0 and x==0:
            print("First Number is 0")
            return
        y=y+x
        ctr+=1

    return y/ctr


print(average())