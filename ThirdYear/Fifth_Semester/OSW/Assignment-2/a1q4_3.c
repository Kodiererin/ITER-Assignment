/*(c) If x is 0 , add 1 to zero count. If x is negative, add x to minus sum. If x is greater than 0 ,
add x to plus sum.*/

#include<stdio.h>
int main(){
	int x;
	scanf("%d %d ",&x);
	printf("%d\n",x);
	int zero_count;
	int minus_sum;
	int plus_sum;
	if(x==0){
		zero_count=1;
	}else if(x<0){
		minus_sum=1;
	}else{
		plus_sum = 1;
	}
	return 0;

}




