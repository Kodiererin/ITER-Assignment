# Name : UJJWAL KUMAR
# Registration Number : 2141011063
# Section : C

# ----------------------- MAJOR ASSIGNMENT - 1 --------------------------------------

# 4. Write a function that generates a random password. The password should have a random length of
# between 7 and 10 characters. Each character should be randomly selected from positions 33 to 126
# in the ASCII table. Your function will not take any parameters. It will return the randomly generated
# password as its only result. Display the randomly generated password in your file’s main program.

import random
import string

def generateRandomPass():
    password = ''.join(random.choice(string.printable[33:127]) for i in range(random.randint(7,10)))
    return password

def main():
    print("The Password is ", generateRandomPass())

if __name__=='__main__':
    main()