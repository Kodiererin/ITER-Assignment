#include<stdio.h>

int main(){
	int x;
	printf("Enter A Number \n");
	scanf("%d",&x);
	r = x>100;
	if(r==1){
		printf("Number is Greater than 100\n");
		return 0;
	}else{
		printf("Number is Less than 100\n");
		return 0;
	}
}
