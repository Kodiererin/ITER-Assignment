// Increment the Pointer

#include<stdio.h>
int main(){
	int a;
	int *ptr;
	
	ptr = &a;
	*ptr = 19;
	
	int *ptr1 = ptr+1;
	int *ptr2 = ptr+2;
	
	printf("%d %p %p %p",*ptr  , ptr , ptr1 , ptr2);
	printf("\nPrinting the Value of Pointer %d %d %d",*ptr   , *ptr1 , *ptr2);

	return 0;
}

