# 7. Write a function areaTriangle that takes the lengths of three sides: side1, side2, and side3 of the
# triangle as the input parameters and returns the area of the triangle as the output. Also, assert that sum
# of the length of any two sides is greater than the third side. Write a function main that accepts inputs
# from the user interactively and computes the area of the triangle using the function areaTriangle.
import math


def areaTriangle(x, y, z):
    assert (x + y) > z, "Two sides must be greater than the third side"
    s = (x + y + z) / 2
    return math.sqrt(s * (s - x) * (s - y) * (s - z))


def main():
    if __name__ == '__main__':
        x, y, z = int(input("Enter The First Side")), int(input("Enter The Second  Side")), int(
            input("Enter The Third Side"))
        print(areaTriangle(x,y,z))

main()