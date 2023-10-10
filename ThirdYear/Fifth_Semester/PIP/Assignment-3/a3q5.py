"""
5. The following table lists the sound level in decibels for several common noises. Write a program that
reads a sound level in decibels from the user. If the user enters a decibel level that matches one of the
noises in the table then your program should display a message containing only that noise. If the user
enters a number of decibels between the noises listed then your program should display a message
indicating which noises the value is between. Ensure that your program also generates reasonable
output for a value smaller than the quietest noise in the table, and for a value larger than the loudest
noise in the table.
"""


noise = int(input("Enter the Value of X"))

if noise == 130:
    print("Jackhammer")
elif noise<130 and noise>106:
    print("Between Gas Lawnmower and Jackhammer")
elif(noise==106):
    print("Between Gas Lawnmower ")
elif noise<106 and noise>70:
    print("Between Alarm clock and Gas Lawnmover")
elif noise == 70:
    print("Alarm  Room")
elif noise<70 and noise>40:
    print("Between Alarm Clock  and Quiet Room")
elif noise == 40:
    print("Quiet Room")
else:
    print("Data does not exist")
