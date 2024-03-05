#include<stdio.h>
int main(){
	int a = 10;
	int *p = &a;
//	Printing the Value and Address of A	
	printf("%d - %p\n", a,&a);
//	Printing the Value and Address of P	
	printf("%p - %p\n",p,&p);
	
// 	Using Null
	int *q = Null;
	q = &p;
	printf("%p -  %p",q,&q);	
	return 0;
}
