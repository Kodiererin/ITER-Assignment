// WP to read four digit no from user then findout the sum of sum of the digits of that input no

#include<stdio.h>
int main(){
	int no;
	int sum=0;
	if(no<0){
		no = -1*no;
	}
	scanf("%d",&no);
	while(no!=0){
		sum+= no%10;
		no = no/10;
	}
	printf("Sum = %d",sum);
	return 0;
}
