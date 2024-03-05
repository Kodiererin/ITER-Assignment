#include<stdio.h>
// Sum of array of Elements using Pointer

int main(){
	int *p;
	int arr[5];
	p = &arr[0];
	int sum = 0;
	printf("Enter the Element  \n");
	int i=0;
	while(i<5){
		scanf("%d\n",(p+i));
		sum+=*(p+i);
		i++;
	}
	
	printf("Sum of the Array is %d",sum);
	
	return 0;
}
