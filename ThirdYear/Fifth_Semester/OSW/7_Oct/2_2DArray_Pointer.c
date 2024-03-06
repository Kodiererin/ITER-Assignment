/*
	Array Manupulation using Indexing
*/


#include<stdio.h>
int main(){

//	in Both ways it is working
//	int arr[3][4] = {1,2,3,4,5,6,7,8,9,10,11,12};
	int arr[3][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	int i,j;
	// Enter the Values
	/*
		
	int arr1[3][4];
	for(i=0 ; i<3 ; i++){
	printf("Enter the %d row Value ",i);
		for(j=0 ; j<4 ; j++){
			scanf("%d",&arr1[i][j]);
		}
	}
	
	*/
	
	for(i=0 ; i<3 ; i++){
		for(j=0 ; j<4  ;j++){
			printf("%d\t",*(*(arr+i)+j));
		}
		printf("\n");
	}
	
	
	/*
		
	for(i=0 ; i<3 ; i++){
		for(j=0 ; j<4  ;j++){
			printf("%d\t",arr1[i][j]);
		}
		printf("\n");
	}
	return 0;
	*/
}
