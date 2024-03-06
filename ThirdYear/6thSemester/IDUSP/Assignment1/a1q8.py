# Use the following data to plot the number of applicant per year as a scatter plot.
# year = [2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012]
# no application per year = [921261, 929198, 1043739, 1186454,
# 1194938, 1304495, 1356805, 1282000, 479651]
#
#



import matplotlib.pyplot as plt


year = [2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012]
applicationPerYear = [921261, 929198, 1043739, 1186454, 1194938, 1304495, 1356805, 1282000, 479651]


plt.scatter(year, applicationPerYear, color='blue', marker='o')


plt.xlabel('Year')
plt.ylabel('Number of Applications')
plt.title('Number of Applicants per Year')

# Display the plot
plt.show()
