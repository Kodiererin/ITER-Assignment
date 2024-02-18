#include<stdio.h>

int main(){
	int *a;
	int arr[] = {10,20,30,40};
	a = arr;
	
	printf("%p",&arr);
	printf("\n");
	printf("%p",&a);
	printf("\n");
	printf("%p",arr[0]);
	
	for(int i=0 ; i<4 ; i++){
		*(a+i) = i;
		printf("%d",*(a+i));
	}
	printf("\n");
	for(int i=0 ; i<4 ; i++){
		printf("%d",*(a+i));
	}
}
