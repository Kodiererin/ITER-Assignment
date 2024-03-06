# Plot the temperature extremes in certain region of India for each month, starting in January, which are
# given by (in degrees Celsius).
# max: 17, 19, 21, 28, 33, 38, 37, 37, 31, 23, 19, 18
# min: -62, -59, -56, -46, -32, -18, -9, -13, -25, -46, -52, -58


import matplotlib.pyplot as plt

months = range(1, 13)
max_temperatures = [17, 19, 21, 28, 33, 38, 37, 37, 31, 23, 19, 18]
min_temperatures = [-62, -59, -56, -46, -32, -18, -9, -13, -25, -46, -52, -58]

plt.figure(figsize=(10, 6))

plt.plot(months, max_temperatures, 'r-', label='Max Temperature')
plt.plot(months, min_temperatures, 'b-', label='Min Temperature')

plt.title('Temperature Extremes in a Region of India')
plt.xlabel('Month')
plt.ylabel('Temperature (°C)')
plt.xticks(months, ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'])

plt.legend()
plt.grid(True)
plt.show()
