//  8. Write a program that prompts the user for the two legs of a right triangle and makes use of the pow
//  and sqrt functions and the Pythagorean theorem to compute the length of the hypotenuse


#include <stdio.h>
#include <math.h>

int main(){
    int side1;
    int side2;
    printf("Enter the First Side \n");
    scanf("%d",&side1);
    printf("Enter the Second Side \n");
    scanf("%d",&side2);
    float side3;
    side3 = sqrtf(pow(side1,2)+pow(side2,2) , 0.5);
    printf("%d",side3);
    
}