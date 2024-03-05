/*5. The greatest common divisor (gcd) of two integers is the product of the integers common factors.
Write a program that inputs two numbers and implements the following approach to finding their gcd.
We will use the numbers −252 and 735. Working with the numbers’ absolute values, we find the
remainder of one divide by the other.*/

#include<stdio.h>
int main(){
	int dividend, divisor;
    printf("Enter the Divisor: ");
    scanf("%d", &divisor);

    printf("Enter the Dividend: ");
    scanf("%d", &dividend);
    dividend = (dividend < 0) ? -dividend : dividend;
    divisor = (divisor < 0) ? -divisor : divisor;

    while (dividend % divisor != 0) {
        int remainder = dividend % divisor;
        dividend = divisor;
        divisor = remainder;
    }
    printf("The Greatest Common Divisor is: %d\n", divisor);

    return 0;
}