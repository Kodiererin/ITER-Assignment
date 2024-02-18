#include<stdio.h>
// Pointer Substracion. ie: 2 Pointers can be substracted if both the pointers point to the same type.
int main(){
	int a;
	int b;
	
	int *p;
	int *q;
	
	p = &a;
	q = &b;
	
	*p = 10;
	*q = 20;
	
	printf("Substracting the pointers %d",q-p);
	return 0;
}
