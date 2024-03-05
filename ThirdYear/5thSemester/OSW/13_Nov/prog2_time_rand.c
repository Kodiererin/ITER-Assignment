#include<stdlib.h>
#include<stdio.h>
#include<time.h>
int main(){
	int x;
	srand(time(NULL));
//	x = rand();
	printf("%d\n",rand()%10);
	
	return 0;
}
