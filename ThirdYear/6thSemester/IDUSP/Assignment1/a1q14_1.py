import matplotlib.pyplot as plt

test1_grades = [99, 90, 85, 97, 80]
test2_grades = [100, 85, 60, 90, 70]

plt.scatter(test1_grades, test2_grades)
plt.xlabel('Test 1 Grades')
plt.ylabel('Test 2 Grades')
plt.title('Scatter Plot with Unequal Axes')
plt.show()
