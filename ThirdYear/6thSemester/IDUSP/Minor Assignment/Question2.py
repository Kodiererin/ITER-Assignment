from Student import students
import matplotlib.pyplot as plt

# 2. Create a line chart for student ids and Computer Science marks. Student id on the x-axis and
# Computer Science mark on the y-axis.

xPoints = [i.get('student_id') for i in students]
yPoints = [i.get('Computer_Science') for i in students]
plt.title('Students vs Computer Science')
plt.xlabel('Student ID')
plt.ylabel('Computer Science Marks')
plt.plot(xPoints, yPoints)
plt.show()