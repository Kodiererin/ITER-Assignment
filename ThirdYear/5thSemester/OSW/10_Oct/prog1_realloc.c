#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
int main(){
	int *p;
	int *p1;
	// For malloc
	int sizeN;
	int sizeN2;
	
	printf("Enter the Size of the Array\n");
	scanf("%d",&sizeN);
	
	p = (int *)calloc(sizeN,sizeof(int));
	//checking if the memory is allocated or not
	if(p==NULL)
	{
		printf("Memory Allocation error!\n");
		return 1;
	}
	
	// Entering the Data in the Array
	("Enter the Values in the Array of size %d",sizeN);
	for(int i=0 ; i<sizeN ; i++){
		scanf("%d\n",(p+i));
	}
	
	
	// De allocating the value of P to a new memory
	printf("Enter the Size that you want to increase ");
	scanf("\n%d",&sizeN2);
	p1 = realloc(p,sizeN2);
	
	if(p==p1){
		printf("\nInplace Reallocation of the Memory\n");
	}else if(p1==NULL){
		printf("\nMemory Allocation Error\n");
	}else{
		printf("\nThe Memory is shifted to a new Memory Location\n");
	}
	
	
	// Printing the Data in the Array
	printf("Printing the Values in the Array of size %d\n",sizeN2);
	for(int i=0 ; i<sizeN2 ; i++){
		printf("\n%d\n",*(p1+i));
	}

	printf("Freeing the Value of Both the pointers \n");
	printf("\n Initially the P had the Location : %p",p);
	free(p);
	printf("\n Finally the P has the Location : %p",p);
	sleep(10);
	
	printf("\n Initially the P1 had the Location : %p",p1);
	free(p1);
	printf("\n Finally the P1 has the Location : %p",p1);
	
	return 0;
}
