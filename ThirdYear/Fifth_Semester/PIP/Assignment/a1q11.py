# 11. Write a program that asks the user to enter the width and length of a room. Once these values have
# been read, your program should compute and display the area of the room. The length and the width
# will be entered as floating-point numbers. Include units in your prompt and output message; either
# feet or meters, depending on which unit you are more comfortable working with.


length , breadth = float(input("Enter The Length in meters ")),float(input("Enter The Breadth meters "))
print("The Area of the Room in ",length*breadth," meter square")