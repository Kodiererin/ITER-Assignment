# Define p-value and write a python program to find the two-sided p-value with and without continuity
# correction when the values of x(observed no. of heads), mean and standard deviation are 110, 100, 5
# respectively.

import math
def calculate_p_value(observed: float, mean: float, std_dev: float, continuity_correction: bool = False) -> float:
    z_score = (observed - mean) / std_dev
    if continuity_correction:
        correction = 1 / (2 * std_dev)
        if z_score < 0:
            p_value = 2 * correction * math.erf(z_score / math.sqrt(2))
        else:
            p_value = 2 * (1 - correction * math.erf(z_score / math.sqrt(2)))
    else:
        if z_score < 0:
            p_value = 2 * (1 - math.erf(-z_score / math.sqrt(2)))
        else:
            p_value = 2 * math.erf(z_score / math.sqrt(2))
    return p_value


def main() -> None:
    observed: float = 110
    mean: float = 100
    std_dev: float = 5

    # Without continuity correction
    p_value_no_correction = calculate_p_value(observed, mean, std_dev)
    print("Two-sided p-value without continuity correction:", p_value_no_correction)

    # With continuity correction
    p_value_with_correction = calculate_p_value(observed, mean, std_dev, continuity_correction=True)
    print("Two-sided p-value with continuity correction:", p_value_with_correction)


if __name__ == "__main__":
    main()
