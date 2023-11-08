#include<stdlib.h>
#include<stdio.h>

// WAP to dynamically allocate a memory of 40 and float size and store the address to the respective pointer

// using calloc

int main(){
	int *p = (int *)calloc(2,sizeof(int));
	// 2 bloc of size 40 respectively
	*p = 100;
	printf("\n%d\t%p\n",*p,p);      
	*p = *p+10;
	printf("\n%d\t%p\n",*p,p);      
	
	float *q = (float *)malloc(sizeof(float));
	*q = 200.00;
	printf("\n%f\t%p\n",*q,q);     
	*q = *q+10.1000;
	printf("\n%f\t%p\n",*q,q);      
	
	
	
	return 0;
}
