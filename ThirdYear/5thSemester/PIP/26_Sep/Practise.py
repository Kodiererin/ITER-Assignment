import math 

g = 9.8

initialSpeed = input("Enter an Initial Speed\n")
height = input("Enter Height\n")


finalVelocity = math.sqrt(math.pow(initialSpeed,2) + (2*g*height) )
print(finalVelocity)
