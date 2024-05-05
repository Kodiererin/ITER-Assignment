# 1. Write a menu-driven program to perform Addition, Subtraction, Scalar Multiplication, Dot Product
# and Length of vectors.

import math
from typing import List
vector = List[float]

def addition(vector1: vector, vector2: vector) -> vector:
    return [vector1[i] + vector2[i] for i in range(len(vector1))]

def substraction(vector1: vector, vector2: vector) -> vector:
    return [vector1[i] - vector2[i] for i in range(len(vector1))]

def multiplicaiton(vector: vector, scalar: float) -> vector:
    return [scalar * element for element in vector]

def dot_product(vector1: vector, vector2: vector) -> float:
    return sum(vector1[i] * vector2[i] for i in range(len(vector1)))

def length_of_vector(vector: vector) -> float:
    return math.sqrt(sum(element ** 2 for element in vector))

def main() -> None:
    while True:
        print("\nMenu:")
        print("1. Addition of Vectors")
        print("2. Subtraction of Vectors")
        print("3. Scalar Multiplication of Vector")
        print("4. Dot Product of Vectors")
        print("5. Length of Vector")
        print("6. Exit")

        choice = input("Enter your choice (1-6): ")

        if choice == '1':
            vector1 = [float(x) for x in input("Enter vector 1 (separate elements by space): ").split()]
            vector2 = [float(x) for x in input("Enter vector 2 (separate elements by space): ").split()]
            print("Result:", addition(vector1, vector2))

        elif choice == '2':
            vector1 = [float(x) for x in input("Enter vector 1 (separate elements by space): ").split()]
            vector2 = [float(x) for x in input("Enter vector 2 (separate elements by space): ").split()]
            print("Result:", substraction(vector1, vector2))

        elif choice == '3':
            vector = [float(x) for x in input("Enter vector (separate elements by space): ").split()]
            scalar = float(input("Enter scalar value: "))
            print("Result:", multiplicaiton(vector, scalar))

        elif choice == '4':
            vector1 = [float(x) for x in input("Enter vector 1 (separate elements by space): ").split()]
            vector2 = [float(x) for x in input("Enter vector 2 (separate elements by space): ").split()]
            print("Result:", dot_product(vector1, vector2))

        elif choice == '5':
            vector = [float(x) for x in input("Enter vector (separate elements by space): ").split()]
            print("Length:", length_of_vector(vector))

        elif choice == '6':
            print("Exiting...")
            break

        else:
            print("Invalid choice. Please enter a number between 1 and 6.")

if __name__ == "__main__":
    main()
