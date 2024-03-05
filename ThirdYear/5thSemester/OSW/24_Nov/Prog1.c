// Demo of typedef:
#include<stdio.h>
int main(){
	int a = 20;
	typedef int kemcho;
	//typedef float double;			// Rules does not Support.
	kemcho b = 10;
	
	typedef int* ujjwalPointer;
	ujjwalPointer x = &b;
	
	printf("%d -> Changed Datatype -> %d \n",a,b);
	
	printf("The Changed pointer data is %p \n",x);
	return 0;
}
