/*
	WAP to program to compute x power n , where x and n are integer. Your program must use a function with two input
	parameter , x and n . The main function to display the power clearly state the function declarationm function call and function defination
*/


#include<stdio.h>

/*Function Declaration */
int powerX(int x,int y);

int powerX(int x,int y){
	if(y==0 && x!=0){
		return 1;
	}
	else if(x==0){
		return 0;
	}
	int power = 1;
	for(int i=1 ; i<=y ; i++){
		power = power*x;
	}
	return power;
}

/*Function Initialization */

int main(){
	int num,pow;
	printf("Enter The Number and The Power\n");
	/*Function Call*/
	scanf("%d",&num);
	scanf("%d",&pow);
	printf("%d",powerX(num,pow));
	
	return 0;
}
