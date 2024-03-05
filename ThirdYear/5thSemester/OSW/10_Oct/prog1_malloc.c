#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
int main(){
	int *p;
	// For malloc
	int sizeN;
	printf("Enter the Size of the Array\n");
	scanf("%d",&sizeN);
	
	p = (int *)calloc(sizeN,sizeof(int));
	//checking if the memory is allocated or not
	if(p==NULL)
	{
		printf("Memory Allocation error!\n");
		return 1;
	}
	
	// Displaying the  initial Values
	//printf("Displaying the Initial Values\n"); 
	//for(int i=0 ; i<sizeN ; i++){
	//	printf("%d\n",*(p+i));
	//}
	
	
	// Entering the initial value to check in the malloc
	printf("Enter the Values in the Array of size %d\n",sizeN);
	for(int i=0 ; i<sizeN ; i++){
		scanf("%d\n",(p+i));
	}
	
	// Displaying the Values 
	for(int i=0 ; i<sizeN ; i++){
		printf("%d\n",*(p+i));
	}
	
	printf("Printing the Value of p\n");
	// Displaying the pointer address
	printf("/nPointer address is %p",p);
	sleep(10);
	free(p);
	printf("/nPointer address is after clearing %p",p);
	
	return 0;
}
