#include<stdio.h>

int maximum(a,b);

int maximum(int a,int b){
	return a>b?a:b;
}
int main(){
	int *column[3];
	int row1[3];
	int row2[3];
	int row3[3];
	column[0] = &(row1[0]); 
	column[1] = &(row2[0]); 
	column[2] = &(row3[0]); 
	printf("%p , %p , %p \n",column[0],column[1],column[2]);
	int max[4];
	
	
	printf("Enter The Numbers \n");
	
	for(int i=0 ; i<3 ; i++){
		scanf("%d ",&row1[i]);
	}
	
	printf("Enter The Numbers \n");
	
	for(int i=0 ; i<3 ; i++){
		scanf("%d",&row2[i]);
	}
	
	printf("Enter The Numbers \n");
	
	for(int i=0 ; i<3 ; i++){
		scanf("%d",&row3[i]);
	}
	
	printf("\n----------------------------- \n");
	printf("\nPrinting The Numbers \n");
	
	for(int i=0 ; i<3 ; i++){
		printf("%d \n",row1[i]);
	}
	
	for(int i=0 ; i<3 ; i++){
		printf("%d \n",row2[i]);
	}
	
	for(int i=0 ; i<3 ; i++){
		printf("%d \n",row3[i]);
	}
	
	// Storing the Maximum of Each Columns
	for(int i=0 ; i<3 ; i++)
	{
		max[i] = (*column[i]);
		for(int j=0 ; j<3 ; j++){
			max[i] = maximum(max[i] , *((column[i]) + j));
		}
	}
	printf("\n----------------------------- \n");
	for(int j=0 ; j<3 ; j++){
		printf("%d \n" , max[j]);
	}
	
	
	return 0;
}
