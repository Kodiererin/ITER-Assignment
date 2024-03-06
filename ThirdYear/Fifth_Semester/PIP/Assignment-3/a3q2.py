"""
2. It is commonly said that one human year is equivalent to 7 dog years. However, this simple conversion
must recognize that dogs reach adulthood in approximately two years. As a result, some people
believe that it is better to count each of the first two human years as 10.5 dog years and then count
each additional human year as 4 dog years. Write a program that implements the conversion from
human to dog years described in the previous paragraph. Ensure that your program works correctly
for conversions of less than two human years and conversions of two or more human years. Your
program should display an appropriate error message if the user enters a negative number
"""



human = float(input("Enter the Number of Human Year"))

if human<0:
    print("Human Year Less than 0")
elif human<=2:
    print(human*10.5)
else :
    print(2*10. + (human-2)*4)
