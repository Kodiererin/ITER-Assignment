// Hello Looping in C
#include<stdio.h>
int main(){
	// Using goto Statement
	int i=0;
	int sos;
	if(i<10){
		printf("Hello GoTo Statement \n");
		
		// THis is a unconditional Jump
		// This might create error
		i+=1;
		goto sos;
	}
	printf("Loop Ended.....");
	return 0;
}
