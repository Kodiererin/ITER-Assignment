#include<stdio.h>

#include<stdlib.h>

int main(){
	void *r;
	int a = 10;
	*(int *)r = a;
	printf("%d ",r);
	printf("%p ",r);
	return 0;
}
