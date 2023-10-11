/*5. The greatest common divisor (gcd) of two integers is the product of the integers common factors.
Write a program that inputs two numbers and implements the following approach to finding their gcd.
We will use the numbers −252 and 735. Working with the numbers’ absolute values, we find the
remainder of one divide by the other.*/

#include<stdio.h>
int main(){
	int dividend,divisor;
	printf("Enter The Dividend and the Divisor \n");
	scanf("%d%d",&dividend,&divisor);
	while(dividend%divisor){
		int rem = dividend%divisor;
		dividend = rem;
		divisor = dividend;		
			  
	}
	printf("%d\t%d",dividend , divisor);
	return 0;
}
