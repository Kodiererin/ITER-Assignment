#include<stdio.h>

int main(){
	int x;
	printf("Enter A Number \n");
	scanf("%d",&x);
	if(x>100 && x%2==0){
		printf("Even and Greater than 100");
	}else if(x<100 && x%2!=0){
		printf("Number is less than 100 and odd");
	}else{;}
}
