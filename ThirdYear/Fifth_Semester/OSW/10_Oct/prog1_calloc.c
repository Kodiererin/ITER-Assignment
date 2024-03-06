#include<stdlib.h>
#include<stdio.h>
int main(){
	int *p;
	// For malloc
	int sizeN;
	printf("Enter the Size of the Array\n");
	scanf("%d",&sizeN);
	
	p = (int *)calloc(sizeN*sizeof(int));
	//checking if the memory is allocated or not
	if(p==NULL)
	{
		printf("Memory Allocation error!\n");
		return 1;
	}
	
	// Displaying the Initial Values
	
	// Displaying the Values 
	for(int i=0 ; i<sizeN ; i++){
		printf("%d",*(p+i));
	}
	
	
	// Entering the initial value to check in the malloc
	printf("Enter the Values in the Array of size %d",sizeN);
	for(int i=0 ; i<sizeN ; i++){
		scanf("%d",(p+i));
	}
	
	// Displaying the Values 
	for(int i=0 ; i<sizeN ; i++){
		printf("%d",*(p+i));
	}
	
	// Getting the address of P and Freeing the p from the memory location
	printf("\n%p",p);
	printf("\n%d",*p);
	sleep(10);
	free(p);
	printf("\n%p",p);
	
	return 0;
}
