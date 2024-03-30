# 6. Write a Python program to find the correlation between Computer Science and M ath marks
import math

from Student import students

maths = [students.get('Math') for students in students]
computerScience = [students.get('Computer_Science') for students in students]

print(maths)
print(computerScience)

# 1. Mean of Both the Subjects
meanMaths = sum(maths)/len(maths)
meanComputerScience = sum(computerScience)/len(computerScience)

# 2. Standard deviation of both the Subjects

standardDeviationMaths = pow(sum(pow((i - meanMaths), 2) for i in maths) / len(maths), 0.5)
standardDeviationComputerScience = pow(sum(pow((i - meanComputerScience), 2) for i in computerScience) / len(computerScience), 0.5)
print("Standard Deviation Maths ",standardDeviationMaths)
print("Standard Deviation Computer Science",standardDeviationComputerScience)

# 3. CoVariance
covariance = sum((math - meanMaths) * (cs - meanComputerScience) for math, cs in zip(maths, computerScience)) / (len(maths) - 1)

print("Covariance:", covariance)

# 4. Correlation Coefficient :

correlation_coefficient = covariance / (standardDeviationMaths * standardDeviationComputerScience)
print("Correlation coefficient:", correlation_coefficient)
