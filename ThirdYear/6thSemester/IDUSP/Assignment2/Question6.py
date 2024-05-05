# 6. Write a program to find median of a given list of integers. Combine both odd and even number of
# terms.


def find_median(numbers):
    numbers.sort()
    length = len(numbers)
    if length % 2 == 0:
        middle_index1 = length // 2 - 1
        middle_index2 = length // 2
        median = (numbers[middle_index1] + numbers[middle_index2]) / 2
    else:
        middle_index = length // 2
        median = numbers[middle_index]
    return median

def main():
    numbers = [int(x) for x in input("Enter the list of integers separated by space: ").split()]
    median = find_median(numbers)
    print("Median:", median)

if __name__ == "__main__":
    main()
