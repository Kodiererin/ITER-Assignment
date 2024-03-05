/*Swapping of Variables in C*/

#include<stdio.h>

void swap(int *p , int *q);


int main(){
	int x;
	x = 10;
	int y;
	y = 20;
	printf("Before Swapping %d - %d", x,y);
	swap(&x,&y);
	printf("\nAfter Swapping %d - %d", x,y);
	return 0;
}

void swap(int *p , int *q){
	int t;
	t = *p;
	*p = *q;
	*q = t;
}
