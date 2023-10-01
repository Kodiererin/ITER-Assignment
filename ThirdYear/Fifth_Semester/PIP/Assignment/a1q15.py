# 15. Write a program that reads three integers from the user and displays them in sorted order (from
# smallest to largest). Use the min and max functions to find the smallest and largest values. The middle value can be found by computing the sum of all three values, and then subtracting the minimum value
# and the maximum value.

import math
a , b, c = (int(input("Enter First Number "))) , (int(input("Enter First Number "))) , (int(input("Enter First Number ")))

x = max(a,b,c)
y = min(a,b,c)

print(y,a+b+c-x-y,x)

