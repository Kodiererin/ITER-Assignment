import math

def series_a_sum(x, n):
    result = 0
    for i in range(n):
        term = ((-1)**i) * (x**(2*i)) / math.factorial(2*i)
        result += term
    return result

x = 0.5
n = 10
result_a = series_a_sum(x, n)
print(result_a)



import math

def series_b_sum(x, n):
    result = 0
    for i in range(n):
        term = (x**i) / math.factorial(i)
        result += term
    return result

x = 2.0
n = 10
result_b = series_b_sum(x, n)
print(result_b)
