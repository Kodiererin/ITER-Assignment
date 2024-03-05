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
	
	
       printf("\n%d\t%p\n",*p,p);          
       printf("\n%f\t%p\n",*q,q);  
       
       
      // Allocating P to r
      int *r = (int *)malloc(sizeof(int));
      
      r = p;
       printf("\n%d\t%p\n",*r,r);     
	printf("\n%d\t%p\n",*r,r);          
       //printf("\n%f\t%p\n",*q,q);  
       
       
	return 0;
}
