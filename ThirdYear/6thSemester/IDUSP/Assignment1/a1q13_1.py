import matplotlib.pyplot as plt

mentions = [500, 505]
years = [2017, 2018]

plt.bar(years, mentions)
plt.xlabel('Years')
plt.ylabel('Mentions')
plt.title('Bar Chart without Specifying Axis Limits')
plt.show()
