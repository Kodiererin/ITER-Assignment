#Write a Python program to create a list of 20 vectors by taking student’s M ath, Computer Science
# and Science marks. Find the sum of all these 20 vectors. After that, find the average marks for M ath,
# Computer Science and Science.
# Hint: [50,60,73] will be one vector.

from Student import students

marksVector = [[student.get('Math'), student.get('Computer_Science'), student.get('Science')] for student in students]

sumOfMarks = [sum(student[0] for student in marksVector),
               sum(student[1] for student in marksVector),
               sum(student[2] for student in marksVector)]


averageMarksOfEach = [sum(student[0] for student in marksVector)/len(marksVector),
               sum(student[1] for student in marksVector)/len(marksVector),
               sum(student[2] for student in marksVector)/len(marksVector)]

print(marksVector)
print(sumOfMarks)
print(averageMarksOfEach)