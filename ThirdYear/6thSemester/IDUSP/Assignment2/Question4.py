# 4. Write a function to compute the component-wise mean of a list of vectors. Assert the condition that
# the vectors must be of same length.

from typing import List

Vector = List[float]

def component_wise_mean(vectors: List[Vector]) -> Vector:
    vector_length = len(vectors[0])
    assert all(len(vector) == vector_length for vector in vectors), "All vectors must have the same length"

    mean_vector = [sum(elements) / len(vectors) for elements in zip(*vectors)]
    return mean_vector

def main():
    vectors = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    result = component_wise_mean(vectors)
    print("Component-wise mean:", result)

if __name__ == "__main__":
    main()
