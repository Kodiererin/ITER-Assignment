// Single Pointer - Multiple Variable.

#include<stdio.h>
int main(){
	int a;
	int b;
	int c;
	int *p;
	
	p = &a;
	*p =10;
	
	p = &b;
	*p = 20;
	
	p = &c;
	*p = 30;
	
	p = NULL;
	
	printf("%d %d %d ",a,b,c);
	return 0;
}

