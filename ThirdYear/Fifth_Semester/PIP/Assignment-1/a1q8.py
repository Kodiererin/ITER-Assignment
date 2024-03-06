# 8. Construct logical expressions for representing the following conditions:
# a. marks scored should be greater than 300 and less than 400.
# b. Whether the value of grade is an uppercase letter.
# c. The post is engineer and experience is more than four years.


marks = int(input("Enter The Marks"))
print(marks>300 and marks<400)

grade = input("Enter the Grade ")
print(grade>='A' and grade<='Z')

experience = int(input("Enter the Experience "))
print(experience>=4)


