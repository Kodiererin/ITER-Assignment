"""
. A roulette wheel has 38 spaces on it. Of these spaces, 18 are black, 18 are red, and two are green.
The green spaces are numbered 0 and 00. The red spaces are numbered 1, 3, 5, 7, 9, 12, 14, 16, 18,
19, 21, 23, 25, 27, 30 32, 34 and 36. The remaining integers between 1 and 36 are used to number
the black spaces. Many different bets can be placed in roulette. We will only consider the following
subset of them in this exercise:
– Single number (1 to 36, 0, or 00)
– Red versus Black
– Odd versus Even (Note that 0 and 00 do not pay out for even)
– 1 to 18 versus 19 to 36
Write a program that simulates a spin of a roulette wheel by using Python’s random number generator.
Display the number that was selected and all of the bets that must be payed. For example, if 13 is
selected then your program should display:
The spin resulted in 13...
Pay 13
Pay Black
Pay Odd
Pay 1 to 18
If the simulation results in 0 or 00 then your program should display Pay 0 or Pay 00 without any
further output
"""



import random


def spin():
    result = int(random.randint(0, 36))
    print('The Spin Resulted in ', result)

    if result > 0:
        if (
                result == 1 or result == 5 or result == 7 or result == 9 or result == 12 or result == 14 or result == 16 or result == 18 or result ==
                19 or result == 21 or result == 23 or result == 25 or result == 27 or result == 30 or result == 32 or result == 34 or result == 36):
            print("Pay Red")
            if (result % 2 == 0 and result > 0):
                print("Pay even")
            else:
                print("Pay Odd")
            if (result < 18 and result > 0):
                print("Pay 1-18")
            else:
                print("19-36")
    else:
        if (result != 0 or result != 00):
            print("Green")
            if (result % 2 == 0 and result > 0):
                print("Pay even")
            else:
                print("Pay Odd")
            if (result < 18 and result > 0):
                print("Pay 1-18")
            else:
                print("19-36")
        else:
            print("Pay Black")
            if (result % 2 == 0 and result > 0):
                print("Pay even")
            else:
                print("Pay Odd")
            if (result < 18 and result > 0):
                print("Pay 1-18")
            else:
                print("19-36")



spin()
