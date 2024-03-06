#include<stdlib.h>
#include<stdio.h>
int main(){

	int *arr[5];
	arr[0] = (int *)calloc(5,sizeof(int));
	for(int i=0 ; i<4 ; i++){
		arr[i] =(int *)malloc(4*sizeof(int));
	}
	
	printf("Enter the Value in the Array \n");
	for(int i=0 ; i<4 ; i++){
		for(int j=0 ; j<5 ; j++){
			scanf("%d\n",(*(arr+i)+j));
			printf("The Data Entered is %d\n",*(*(arr+i)+j));
		}
	}
	printf("\nData entered successfully\n");
		for(int i=0 ; i<4 ; i++){
		for(int j=0 ; j<5 ; j++){
			printf("%d\t",*(*(arr+i)+j));
		}printf("\n");
	}
	return 0;
}
