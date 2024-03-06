# Plot histogram for age of male and female in different plots for the following data of male and female
# age.
# male age = [53,51,71,31,33,39,52,27,54,30,64,26,21,54,52,20,59,32]
# female age = [53,65,68,21,75,46,24,63,61,24,49,41,39,40,25,54,42,
# 32,48,23,23]


import matplotlib.pyplot as plt

male = [53, 51, 71, 31, 33, 39, 52, 27, 54, 30, 64, 26, 21, 54, 52, 20, 59, 32]
female = [53, 65, 68, 21, 75, 46, 24, 63, 61, 24, 49, 41, 39, 40, 25, 54, 42, 32, 48, 23, 23]

plt.figure(figsize=(10, 5))

plt.subplot(1, 2, 1)
plt.hist(male, bins=10, color='blue', edgecolor='black', alpha=0.7)
plt.title('Male Age Distribution')
plt.xlabel('Age')
plt.ylabel('Frequency')

plt.subplot(1, 2, 2)
plt.hist(female, bins=10, color='red', edgecolor='black', alpha=0.7)
plt.title('Female Age Distribution')
plt.xlabel('Age')
plt.ylabel('Frequency')

plt.tight_layout()
plt.show()
