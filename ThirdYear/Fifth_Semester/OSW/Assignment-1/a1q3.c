// Write a Program to find the Third Number using Pythagoras Triple

#include<stdio.h>
int main(){
	int m,n;
	printf("Enter 2 Sides of the Triangle ");
	scanf("%d %d",&m,&n);
	float side1 = m*m - n*n;
	float side2 = 2*m*n;
	float hypotenuse = m*m + n*n;
	
	printf("Side-1 %f\nSide-2 %f\n Hypotenuse %f",side1,side2,hypotenuse); 
	return 0;
}
