/*WAP to Read array initialization during compile time and Print the Array*/

#include<stdio.h>
int main(){
	int n = 5;
	int arr1[] = {10,20,30,40,50};
	int arr2[3] = {11,22,33,40,50};
	int arr3[5] = {11,22,33};
	int i;
	printf("Printing the First Array \n");
	for(i=0 ; i<n ; i++)
		printf("%d\n",arr1[i]);
	printf("Printing the Second Array \n");
	for(i=0 ; i<n ; i++)
		printf("%d\n",arr2[i]);
// 	This is the Buffer Problem

	printf("Printing the Third Array \n");
	i=0;
	for(i=0 ; i<n ; i++)
		printf("%d\n",arr3[i]);	
	return 0;
}


