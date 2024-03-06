import matplotlib.pyplot as plt


input_string = input("Enter a string: ").lower()


frequency_dict = {}


for char in input_string:
    if char.isalpha():
        frequency_dict[char] = frequency_dict.get(char, 0) + 1

# Step 4: Plot frequencies as a bar chart
plt.bar(frequency_dict.keys(), frequency_dict.values())
plt.xlabel('Alphabets')
plt.ylabel('Frequency')
plt.title('Frequency of Alphabets')
plt.show()
