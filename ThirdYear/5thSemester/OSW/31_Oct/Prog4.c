// Pointer Pointing to another Pointer

#include<stdio.h>
int main(){
	int a;
	int b;
	int c;
	
	int *p1;
	int *p2;
	int *p3;
	
	p1 = &a;
	p2 = p1;
	p3 = &b;
	
	*p1 = 10;
	*p3 = 20;
	
	printf("%d %d %d",*p1,*p2,*p3);

	return 0;
}

