#include<stdio.h>
int * funcPointer();



int main(){
	int *p;
	p = funcPointer();
	printf("%d",*p);
	return 0;	
}


int * funcPointer(){
	static x = 10;
	return &x;
}

