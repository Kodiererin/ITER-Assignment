#include<stdio.h>
int main(){
	int a;
	a = 10;
	
	int b;
	b = 10;
	
	int *p;
	p = &a;
	printf("Value of a is %d\n",a);
	*p = a;
	printf("Value of a is %d\n",*p);
	
	*p = a*a + a + 1;
	printf("Value of Updated a is %d\n",*p);
	
	int *q = &b;
	
	*q = *q * *q  + *q + 1;
	printf("Value of Updated b is %d\n",*q);
	
// 	Dereferencing the Value
	*p = NULL;
	printf("%d\n",a);
	printf("%d %p\n",*p,&p);
	
	printf("%d\n",*(&a));
	printf("%d\n",*(&a));	
	return 0;
}
