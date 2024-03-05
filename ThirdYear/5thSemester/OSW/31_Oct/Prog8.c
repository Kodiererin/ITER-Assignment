// Array of Pointers

#include<stdio.h>
int main(){
	int *p;
	
	int a[3];
	p = &a[0];
	*p = 10;
	*(p+1) = 20;
	*(p+2) = 30;
	
	printf("%d %d %d ",a[0],a[1],a[2]);
	
	return 0;
}

