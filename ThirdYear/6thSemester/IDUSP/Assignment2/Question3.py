# 3. Write two functions that extract the rows and columns of a matrix A.


from typing import List

Matrix = List[List[float]]

def extract_rows(matrix: Matrix) -> List[List[float]]:
    return matrix

def extract_columns(matrix: Matrix) -> List[List[float]]:
    num_rows = len(matrix)
    num_cols = len(matrix[0]) if matrix else 0
    return [[matrix[i][j] for i in range(num_rows)] for j in range(num_cols)]

def main():
    # Example usage
    matrix_A = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    print("Original Matrix:")
    for row in matrix_A:
        print(row)

    print("\nExtracted Rows:")
    rows = extract_rows(matrix_A)
    for row in rows:
        print(row)

    print("\nExtracted Columns:")
    columns = extract_columns(matrix_A)
    for col in columns:
        print(col)

if __name__ == "__main__":
    main()
