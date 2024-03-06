import matplotlib.pyplot as plt

mentions = [500, 505]
years = [2017, 2018]

plt.bar(years, mentions)
plt.xlabel('Years')
plt.ylabel('Mentions')
plt.title('Bar Chart with Y-axis Starting from 0')
plt.ylim(0)  # Set the y-axis limit to start from 0
plt.show()
