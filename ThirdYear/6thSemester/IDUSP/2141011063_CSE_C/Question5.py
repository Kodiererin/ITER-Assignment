# Write a Python program to find the covariance of Math and Science marks.

from Student import students

mathsMarks = [i.get('Math') for i in students]
scienceMarks = [i.get('Science') for i in students]

meanMaths = sum(mathsMarks) / len(mathsMarks)
meanScience = sum(scienceMarks)/len(scienceMarks)

data = sum([(i - meanMaths) * (j - meanScience) for i, j in zip(mathsMarks, scienceMarks)]) / len(mathsMarks)
print("The Covariance of Maths and Science is ",data)