/*WAP to Read and Print the Array*/

#include<stdio.h>
int main(){
	int n = 5;
	int arr[n];
	int i;
	printf("Enter the Values \n");
	for(i=0 ; i<n ; i++)
		// scanf("%d",i[arr]);
		// Not Allowed
	printf("Printing the the Values \n");
	for(i=0 ; i<n ; i++)
		printf("%d\n",arr[i]);
	printf("Printing in different Way \n");
	for(i=0 ; i<n ; i++)
		printf("%d\n",i[arr]);	
	return 0;
}


