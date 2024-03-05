#include<stdlib.h>
#include<stdio.h>

int main(){
	int *p = (int *)malloc(40);
	printf("\n%d\n",*p);      
	
	float *q = (float *)malloc(sizeof(float));
	printf("\n%f\n",*q);                
	return 0;
}
