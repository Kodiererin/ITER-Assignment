// Demonstration of Array of Pointers.

#include<stdio.h>
int main(){
	int a;
	int b;
	int c;
	
	int *arr[3];
	arr[0] = &a;
	arr[1] = &b;
	arr[2] = &c;
	
	for(int i=0 ; i<3 ; i++){
		printf("Enter The Number \n" ); 
		scanf("%d",arr[i]);
	}
	
	printf("%d %d %d \n",a,b,c);
	printf("%d %d %d ",*arr[0],*arr[1],*arr[2]);
	
	return 0;
}
