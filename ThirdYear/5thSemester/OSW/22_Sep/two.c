#include<stdio.h>
int main(){
	int m = 2147483647;
	short n = 124;
	long long o = 1234567890;
	m = m+1;
	printf("Printing The Numbers \n");
	printf("%d \n",m);
	printf("%u \n",m);
	printf("%hd \n",m);
	printf("%hu \n",n);
	printf("%L \n",o);
	return 0;
}
