/*1. Describe the problem input(s), output(s) and write the algorithm for a program that computes the
circle’s area and circumference. Also write a function prototype to compute the same using radius as
input to the function and return type void.*/

#include<stdio.h>

void circleArea(int);

int main(){
	printf("Enter the Radius of the Circle \n");
	int radius;
	scanf("%d",&radius);
	circleArea(radius);
	return 0;
}

void circleArea(int radius){
	float area = 2*3.14*radius*radius;
	float circumference = 2*3.14*radius;
	printf("Area of Circle is %f\n Circumference of Circle is %f",area,circumference);
}
