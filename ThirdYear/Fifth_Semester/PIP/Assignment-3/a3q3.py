"""
3. The length of a month varies from 28 to 31 days. Create a program that reads the month’s name from
the user as a string. Then your program should display the number of days in that month. Display “28
or 29 days” for February so that leap years is addressed.
"""

month = input("Enter the Month ")
month = month.lower()
days = 0;

if month =='january' or month =='march' or month == 'may' or month == 'july' or month == 'august' or month == 'october' or month=='december':
    days = 31
elif month =='february':
    days = 29
else:
    days = 30

print(month," - ",days)
    
