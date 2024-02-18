// Single Pointer - Multiple Variable.

#include<stdio.h>
int main(){
	int a;
	int b;
	int c;
	
	int *p[3];
	p[0] = &a;
	p[1] = &b;
	p[2] = &c;
	
	*p[0] = 10;
	*p[1] = 20;
	*p[2] = 30;
	
	printf("%d %d %d ", a,b,c); 

	return 0;
}

