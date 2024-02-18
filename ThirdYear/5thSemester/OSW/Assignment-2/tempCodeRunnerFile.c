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