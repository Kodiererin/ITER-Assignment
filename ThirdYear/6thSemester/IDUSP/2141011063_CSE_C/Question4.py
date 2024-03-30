# Write a Python program to find the mean, median and mode of Computer Science marks

from  Student import students

getMean = sum([student.get('Computer_Science') for student in students])/len(students)

data = [student.get('Computer_Science') for student in students]
sorted_data = sorted(data)
# print(data)

getMedian = sorted_data[len(sorted_data)//2]

def getMode(data):
    frequency_dict = {}
    for item in data:
        if item in frequency_dict:
            frequency_dict[item] += 1
        else:
            frequency_dict[item] = 1
    max_frequency = max(frequency_dict.values())
    modes = [key for key, value in frequency_dict.items() if value == max_frequency]
    if len(modes) == 1:
        return modes[0]
    else:
        return modes


mode = getMode([student.get('Computer_Science') for student in students])
print("Mode:", mode)


print("Median = ",getMedian)


print("Mean = ",getMean)