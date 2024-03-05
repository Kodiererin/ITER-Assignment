#include<stdio.h>
#include<stdio.h>
int main(){
	int arr[3][4];
	int (*p)[4];
	 
	 p = arr;
	
	 for(int i=0 ; i<3 ; i++){
	 		for(int j=0  ; j<4 ; j++){
	 			scanf("%d",*(p+i)+j);
	 		}
	 }
	 
	 printf("\n");
	 
	 // Display the array
	 
	 for(int i=0 ; i<3 ; i++){
	 		for(int j=0  ; j<4 ; j++){
	 			printf("%d\t",*(*(p+i)+j));
	 		}
	 		printf("\n");
	 }
	 
	
	return 0;
}
