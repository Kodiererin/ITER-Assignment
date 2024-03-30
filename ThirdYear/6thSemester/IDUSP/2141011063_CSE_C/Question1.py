from Student import students

# 1. Write a Python program to group the student ids corresponding to the following Science mark.
# • less or equal to 30.
# • between 30 and 70.
# • more than 70

lessThanEqualTo30 = [i for i in students if i.get('Science')<=30]

between30And70 = [i for i in students if i.get('Science')>=30 and i.get('Science')<=70]

moreThan70 = [i for i in students if i.get('Science')>70]

print(lessThanEqualTo30)
print(between30And70)
print(moreThan70)