def is_perfect_square(number):
    square_root = int(number ** 0.5)
    return square_root * square_root == number

def sum_of_digits(number):
    digit_sum = 0
    for digit in str(number):
        digit_sum += int(digit)
    return digit_sum

def find_numbers_in_range(start, end):
    numbers = []
    for num in range(start, end + 1):
        if is_perfect_square(num) and sum_of_digits(num) < 10:
            numbers.append(num)
    return numbers

def main():
    start_number = int(input("Enter the starting number of the range: "))
    end_number = int(input("Enter the ending number of the range: "))

    result = find_numbers_in_range(start_number, end_number)
    print("Numbers in the range which are perfect squares and have a sum of digits less than 10:")
    print(result)

if __name__ == "__main__":
    main()
