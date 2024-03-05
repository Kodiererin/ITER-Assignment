// Program to read and write an array.
// Pointer is Array Name.
// It require no additional pointer declaration.


#include<stdio.h>
int main(){
	int arr[4];
	//a.
	int *p = &arr[0];
	
	for(int i=0 ; i<4 ; i++){
	// Both the methods are correct
	// 	scanf("%d",&arr[i]);
	
	//a. 
		//scanf("%d",p+i);
		scanf("%d",arr+i);
	}
	printf("You have Entered the Array \n");
	for(int i=0 ; i<4 ; i++){
	// Both the methods are correct
	// 	scanf("%d",&arr[i]);
		printf("%d\n",*(arr+i));
	}	
	
	printf("Address of each array elements \n");
	for(int i=0 ; i<4 ; i++){
		printf("&arr[%d]= %p\n",i,arr+i);
	}
	
	printf("\n%ld",(arr+3)-(arr+0));
	// arr is the pointer to the array, which is made internally by the computer.
	// Creating my own pointer which will point to the arr[0]
	// int *p = &arr[0];
	printf("\n");
	
	// or int *p = arr ; 
	// p is our pointer pointing towards *p;
	for(int i=0 ; i<4 ; i++){
		printf("&arr[%d]= %p\n",i,p+i);
	}
	
	// Updating the p+i
	printf("Updating the p+i with a constant\n");
	for(int i=0 ; i<4 ; i++){
		p = p+i;
		printf("&arr[%d]= %p\n",i,p);
	}
	// update the p to its initial state ie; to arr[0]
	p = arr;
	return 0;
}
