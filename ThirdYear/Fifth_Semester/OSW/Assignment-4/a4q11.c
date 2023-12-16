/*
	11. Create a function named nextPrime that finds and returns the first prime number larger than some
	integer, n. The value of n will be passed to the function as its only parameter. The main function in
	the program that reads an integer from the user and displays the first prime number larger than the
	entered value. Additionally, your program must specify the function prototype and identify the actual
	argument(s) and formal parameters.
*/

#include<stdio.h>

int nextPrime(int);

int nextPrime(int x){
	int y;
	y = x+1;
	for(int i=1 ; i<y-1 ; i++){
		if(y%i==0){
			y = y+1;
			i=1;
		}
	}
	return y;
}



int main(){
	int num;	
	printf("Enter The Number \n");
	scanf("%d",&num);
	int nextP = nextPrime(num);
	printf("%d",nextP);
}
