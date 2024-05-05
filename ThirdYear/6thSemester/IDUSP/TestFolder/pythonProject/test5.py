# Code on Conditional Probability
import math

pH  = 0.5
pT = 0.5
pH_given_T = 0.6
pT_given_H = 0.4

# Conditional Probability = P(A|B)/P(B)
# Bays Theorem = P(A|B) = (P(B|A) * P(A))/P(B)


# Define a function that says that demonstrates the conditional Probability
print(pH*pH_given_T/(pT))

conditional_prob = (pH_given_T * pH) / pT
print(conditional_prob)


# Demonstrating Bays Theorem
baysTheorem = pT*pT_given_H*pH/(pT)
# print(baysTheorem)


print(math.e)