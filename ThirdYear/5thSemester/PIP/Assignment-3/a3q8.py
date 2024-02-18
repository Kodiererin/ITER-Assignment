"""
8. Write a function to determine whether a given natural number is perfect. A natural number is said to
be a perfect number if it is the sum of its divisors. For Example, 6 is a perfect number because 6 =
1+2+3, but 15 is not because 15 != 1+3+5.
"""


x = int(input("Enter The Number "))
sum = 0
i = 1
while i<(x+1/2):
    if x%i==0:
        sum=sum+i;
    i=i+1
print(x)
if sum-x:
    print("Perfect Number")
else:
    print("Not Perfect Number")
