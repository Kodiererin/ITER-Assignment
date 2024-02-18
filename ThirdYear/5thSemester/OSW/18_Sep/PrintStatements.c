#include<stdio.h>
int main(){
	printf("ITER""SOA \n");
	printf("ITER = %d \n",5);	// error
	printf("Iter=%d SOA=%d \n",4);	// error
	printf("\nITER = %d SOA = %d CSE = %d\n",4,5)
	return 0;
}
