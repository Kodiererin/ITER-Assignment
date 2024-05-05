# 2. Write a program that takes the order of the matrix and creates a matrix in the following manner:
# The (ij)th entry of the matrix should be the sum of i and j. Eg: The 0
# th row and 0
# th column should
# have the value (0+0) i.e. 0 and the 0
# th row and first column should have value (0+1) i.e. 1 and so on.

from typing import List
vector = List[float]

def createMatrix(size : int) -> float:
    return [[i+j for j in range(size)] for i in range(size)]

def main():
    x = createMatrix(int(input("Enter the size of the Matrix : ")))
    for i in x:
        for j in i:
            print(j , end=" ")
        print()

if __name__ == "__main__":
    main()