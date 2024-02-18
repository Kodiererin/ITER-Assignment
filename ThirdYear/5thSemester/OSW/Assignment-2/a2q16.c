/*16. A triangle can be classified based on the lengths of its sides as equilateral, isosceles or scalene. All
three sides of an equilateral triangle have the same length. An isosceles triangle has two sides that are
the same length, and a third side that is a different length. If all of the sides have different lengths then
the triangle is scalene. Write a program that reads the lengths of the three sides of a triangle from the
user. Then display a message that states the triangles type.
*/

#include <stdio.h>

int main() {
    int side1, side2, side3;

    printf("Enter the Sides of the Triangle: \n");
    scanf("%d", &side1);
    scanf("%d", &side2);
    scanf("%d", &side3);

    if (side1 == side2 && side2 == side3)
        printf("Equilateral Triangle\n");
    else if (side1 != side2 && side2 != side3)
        printf("Scalene Triangle\n");
    else
        printf("Isosceles Triangle\n");

    return 0;
}