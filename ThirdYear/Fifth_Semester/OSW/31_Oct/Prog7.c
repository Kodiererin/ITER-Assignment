// Array of Pointers

#include<stdio.h>
int main(){
	int a;
	
	int *p[3];
	p[0] = &a;
	p[1] = &a;
	p[2] = &a;
	
	*p[1] = 10;
	
	printf("%d %d %d \n", a,a,a); 
	printf("%d %d %d ", *p[0],*p[1],*p[2]);

	return 0;
}

