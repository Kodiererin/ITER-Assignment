# 1. An anonymous dataset containing each user’s salary (in dollars) and tenure as a data scientist (in
# years) is given.
# salaries and tenures = [(83000, 8.7), (88000, 8.1), (48000, 0.7),
# (76000, 6), (69000, 6.5), (76000, 7.5), (60000, 2.5), (83000, 10),
# (48000, 1.9), (63000, 4.2)]
# Find out the average salary for each tenure and print a massage according to its value, i.e. ”less than
# two”, ”between two and five” and ”more than five” tenure and group together the salaries corresponding to each bucket. Compute the average salary for each group

salariesandtenures = [(83000, 8.7), (88000, 8.1), (48000, 0.7),
(76000, 6), (69000, 6.5), (76000, 7.5), (60000, 2.5), (83000, 10),
(48000, 1.9), (63000, 4.2)]

lessthanTwo = []
betweenTwoFive = []
moreThanFive = []


for salary, tenure in salariesandtenures:
    if tenure < 2:
        lessthanTwo.append(salary)
    elif 2 <= tenure <= 5:
        betweenTwoFive.append(salary)
    else:
        moreThanFive.append(salary)

avg_lessthanTwo = sum(lessthanTwo) / len(lessthanTwo) if lessthanTwo else 0
avg_betweenTwoFive = sum(betweenTwoFive) / len(betweenTwoFive) if betweenTwoFive else 0
avg_moreThanFive = sum(moreThanFive) / len(moreThanFive) if moreThanFive else 0

# Print messages and average salaries
print("Average salary for:")
print("- Less than two tenure: $", round(avg_lessthanTwo, 2) if avg_lessthanTwo != 0 else "N/A")
print("- Between two and five tenure: $", round(avg_betweenTwoFive, 2) if avg_betweenTwoFive != 0 else "N/A")
print("- More than five tenure: $", round(avg_moreThanFive, 2) if avg_moreThanFive != 0 else "N/A")