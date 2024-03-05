/*
	WAP to compute the factorial of the number function.
	int factorial(int)
*/

#include<stdio.h>

int factorial(int);

int factorial(int n){
	if(n==1){return n;}
	int fact=1;
	for(int i=2 ; i<=n ; i++){
		fact = fact*i;
	}return fact;
}

int main(){
	printf("Enter the Number That You want the Factorial \n");
	int n;
	scanf("%d",&n);
	int result = factorial(n);
	printf("The Factorial of n is %d",result);
	return 0;
}
