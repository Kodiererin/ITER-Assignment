#include<stdio.h>
int main(){
	int *pointer[3];
	int data[3];
	
	for(int i=0 ; i<3 ; i++){
		pointer[i] = &data[i];
	}


	for(int i=0 ; i<3 ; i++){
		scanf("%d" , &data[i]);
	}
	
	for(int i=0 ; i<3 ; i++){
		printf("%d ",*pointer[i]);
	}	
	return 0;
}
