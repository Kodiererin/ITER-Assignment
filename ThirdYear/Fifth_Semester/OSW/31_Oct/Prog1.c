#include<stdio.h>
// Question : 1
// Introduction to Pointers and Variables
int main(){
	int a;
	float b;
	char c;
	
	int *p1;
	float *p2;
	char *p3;
	
	p1 = &a;
	p2 = &b;
	p3 = &c;
	
	printf("Printing the Poiner Address which is linked to the Variable \n");
	printf("%d\n" , *p1);
	printf("%f\n" , *p2);
	printf("%d\n" , *p3);
	
	*p1 = 20;
	*p2 = 20.4;
	*p3 = 'c';
	
	printf("Printing the Variable Value \n");
	printf("%d\n",a);
	printf("%f\n",b);
	printf("%c\n",c);
	
	
	// Printing the Poiner Value
	printf("Printing the Poiner Value \n");
	printf("%d\n",*p1);
	printf("%f\n",*p2);
	printf("%c\n",*p3);
}
