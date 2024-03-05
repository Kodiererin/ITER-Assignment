# 21. Write a program that reads an integer from the user. If the value entered by the user is less than 2 then
# your program should display an appropriate error message. Otherwise, your program should display
# the prime numbers that can be multiplied together to compute n, with one factor appearing on each
# line. For example:
# Enter an integer (2 or greater): 72
# The prime factors of 72 are:
# 2
# 2
# 2
# 3
# 3


def is_prime(num):
    if num <= 1:
        return False
    if num <= 3:
        return True
    if num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

def prime_factors(n):
    factors = []
    i = 2
    while i <= n:
        if n % i == 0:
            if is_prime(i):
                factors.append(i)
                n //= i
            else:
                i += 1
        else:
            i += 1
    return factors

try:
    user_input = int(input("Enter an integer (2 or greater): "))
    if user_input < 2:
        print("Please enter an integer greater than or equal to 2.")
    else:
        print(f"The prime factors of {user_input} are:")
        factors = prime_factors(user_input)
        for factor in factors:
            print(factor)
except ValueError:
    print("Invalid input. Please enter a valid integer.")
