#include<stdlib.h>
#include<stdio.h>

// WAP to dynamically allocate a memory of 40 and float size and store the address to the respective pointer

int main(){
	int *p = (int *)malloc(40);
	*p = 100;
	printf("\n%d\t%p\n",*p,p);      
	*p = *p+10;
	printf("\n%d\t%p\n",*p,p);      
	
	float *q = (float *)malloc(sizeof(float));
	*q = 200.00;
	printf("\n%f\t%p\n",*q,q);     
	*q = *q+10.1000;
	printf("\n%f\t%p\n",*q,q);      
	
	
	// to Free the Memory | deallocate the memory.
	free(p);
	free(q);
	
	// P is a dangling Pointer, where it is pointing to somewhere where the data doesnot exist
	// Q is a dangling Pointer, where it is pointing to somewhere where the data doesnot exist
       printf("\n%d\t%p\n",*p,p);          
       printf("\n%f\t%p\n",*q,q);  
       
       printf("Printing\n");
       p = NULL;
       q = NULL;
       
    //   printf("Pr",*p,p);      
	printf("\n Printing  \t%p\n",p);          
       printf("\nPrinting  : \t%p\n",q);  
       
       
	return 0;
}
