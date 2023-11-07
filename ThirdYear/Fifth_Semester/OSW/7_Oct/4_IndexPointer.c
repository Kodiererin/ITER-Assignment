#include<stdio.h>
#include<stdio.h>
int main(){
	int arr[3][4] = {1,2,3,4,5,6,7,8,9,10,11,12};
	int (*p)[4];
	p = arr;
	
	for(int i=0 ; i<3 ; i++){
		for(int j=0 ; j<4 ; j++){
			printf("%d\t",*(arr[i]+j));
		}
		printf("\n");
	}
	
	printf("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#\n");
	
	for(int i=0 ; i<3 ; i++){
		for(int j=0 ; j<4 ; j++){
			printf("%d\t",*(*(p+i)+j));
		}
		printf("\n");
	}
	
	return 0;
}
