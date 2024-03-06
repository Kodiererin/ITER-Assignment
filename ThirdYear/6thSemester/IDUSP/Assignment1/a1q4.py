# Write a Python Script to generate random passwords (alphanumeric). Ask users to enter the length of
# password and number of passwords they want to generate and then print all the generated passwords


import random

# Ascii value - a-97 z-122
def generateNPass(n):
    for i in range(n):
        password = ''
        for i in range(10):
            n = random.randrange(1, 10)
            if(n%2==0):
                password += chr(random.randrange(97,122))
            else:
                password+=str(random.randrange(0,9))
        print(password)

generateNPass(int(input("Enter the Number of Passwords You want to generate : ")))

