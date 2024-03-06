/*
	8. Write a program that prompts the user for the two legs of a right triangle and makes use of the pow
and sqrt functions and the Pythagorean theorem to compute the length of the hypotenuse.
*/

#include<stdio.h>
#include<math.h>

int main(){
	printf("Enter Height of the Triangle \n");
	float height;
	scanf("%f",&height);
	printf("Enter Base of the Triangle \n");
	float base;
	scanf("%f",&base);
	float hypotenuse;
	
	height = pow(height,2) ;
	base = pow(base,2);
	hypotenuse = sqrt(height+base);
	printf("Hypotenuse of the Triangle is %f\n",hypotenuse);
	return 0;
}
