// Multiple Pointer pointing to Sigle Variable
#include<stdio.h>
int main(){
	int a;
	a = 10;
	int *ptr1;
	int *ptr2;
	
	
	ptr1 = &a;
	ptr2 = &a;
	
	*ptr1 = 20;
	
	printf("%d %d ",*ptr1,*ptr2);
	

	return 0;
}

