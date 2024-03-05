/*WAP to Read character array and Print the Array*/

#include<stdio.h>
int main(){
	int n = 5;
	char arr[n];
	int i;
	printf("Enter the Values \n");
	for(i=0 ; i<n ; i++)
		scanf("%c",&i[arr]);
		//scanf("%c",&arr[i]);
	printf("Printing the the Values \n");
	for(i=0 ; i<n ; i++)
		printf("%c\n",arr[i]);
	printf("Printing in different Way \n");
	for(i=0 ; i<n ; i++)
		printf("%c\n",i[arr]);	
	return 0;
}


