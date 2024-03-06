# Given dataset
salaries_and_tenures = [(83000, 8.7), (88000, 8.1), (48000, 0.7),
                        (76000, 6), (69000, 6.5), (76000, 7.5),
                        (60000, 2.5), (83000, 10), (48000, 1.9),
                        (63000, 4.2)]


less_than_two = []
between_two_and_five = []
more_than_five = []

for salary, tenure in salaries_and_tenures:
    if tenure < 2:
        less_than_two.append(salary)
    elif 2 <= tenure <= 5:
        between_two_and_five.append(salary)
    else:
        more_than_five.append(salary)


avg_less_than_two = sum(less_than_two) / len(less_than_two) if less_than_two else 0
avg_between_two_and_five = sum(between_two_and_five) / len(between_two_and_five) if between_two_and_five else 0
avg_more_than_five = sum(more_than_five) / len(more_than_five) if more_than_five else 0

def check_paid_account(tenure):
    if tenure < 2 or tenure > 5:
        print("Users with very few or very many years of experience tend to pay.")
    else:
        print("Users with average amounts of experience don’t tend to pay.")

# Example usage
tenure = 4  # Example tenure value
check_paid_account(tenure)
