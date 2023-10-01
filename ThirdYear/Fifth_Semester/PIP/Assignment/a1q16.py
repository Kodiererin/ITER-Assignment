# 6. Create a program that reads duration from the user as a number of days, hours, minutes, and seconds.
# Compute and display the total number of seconds represented by this duration.

days,hours,minutes,seconds = int(input("Enter Days \n")),int(input("Enter Hours \n")),int(input("Enter Minutes \n")),int(input("Enter Seconds \n"))

print('No Of Seconds =', (24*days*60*60)+(hours*60*60)+(minutes*60)+seconds)
