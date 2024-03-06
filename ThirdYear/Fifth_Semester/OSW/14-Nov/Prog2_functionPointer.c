#include<stdio.h>
#include<stdlib.h>

int funName();

void funName1(int , int , int *);

int main(){
	printf("The Address of the function is %p\n",funName);
	printf("The Address of the function is %p\n",&funName);
	int (*p)();
	int x;
	int y;
	int *z;
	
	x = 10;
	y = 20;
	
	void (*r)(int , int , int *);
	p = funName;
	r = funName1(x,y,z);
	
	
	printf("%p\n",*p);
	printf("%p\n",*r);
	printf("%d\n",*z);
	return 0;
}

int funName(){
	return 5+7;
}

int funName1(int x , int y , int *z){
	*z = x+y;
}
