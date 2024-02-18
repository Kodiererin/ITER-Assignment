# 14. Write a program that reads a four-digit integer from the user and displays the sum of its digits. For
# example, if the user enters 3141 then your program should display 3 + 1 + 4 + 1 = 9

x = int(input("Enter a Four Digit Number \n"))
sum = 0
a = x//1000
x = x%1000

b = x//100
x = x%100

c = x//10
x = x%10

d = x

print(a,'+',b,'+',c,'+',d,'=',a+b+c+d)