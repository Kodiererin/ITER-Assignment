// Demonstration of Array of Pointers.

#include<stdio.h>
int main(){
	int a;
	int b;
	int c;
	
	int *arr[3];
//	arr[0] = &a;
//	arr[1] = &b;
//	arr[2] = &c;

	(*(arr+0)) = &a;
	(*(arr+1)) = &b;
	(*(arr+2)) = &c;
	
	*(*(arr+0)) = 10;
	*(*(arr+1)) = 20;
	*(*(arr+2)) = 30;
	
	
	
	printf("\n %d %d %d \n",a,b,c);
	printf("%d %d %d \n",*arr[0],*arr[1],*arr[2]);
	printf("%d %d %d \n ",*(*(arr+0)),*(*(arr+1)),*(*(arr+2)));
	
	return 0;
}
