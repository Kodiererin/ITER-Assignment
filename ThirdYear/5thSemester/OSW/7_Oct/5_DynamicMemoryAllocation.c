#include<stdio.h>
#include<stdlib.h>
int main(){
	int *p;
	// allocate the memory and assign to p
	p = (int *) malloc(sizeof(int));
	*p = 100;
	printf("Value in mem  = %d\n",*p);
	
	
	
	return 0;
}
