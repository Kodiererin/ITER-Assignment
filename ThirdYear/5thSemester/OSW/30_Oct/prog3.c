#include<stdio.h>
int main(){
	int a = 10;
	int *p = &a;
	p = &a;
	printf("Value of a %d \n",a);
	printf("Value of a  %d \n",*p);
	printf("Value of a  %p \n",&p);
	printf("Value of a  %p \n",&a);
	printf("Value of a  %d \n",*(&a));
	printf("######################################\n");
	a = 20;
	printf("Value of a %d \n",a);
	printf("Value of a  %d \n",*p);
	printf("Value of a  %p \n",&p);
	printf("Value of a  %p \n",&a);
	printf("Value of a  %d \n",*(&a));
	p = NULL;
	printf("Value of a P when it is initialized to Null %p \n",p);
	return 0;
}
