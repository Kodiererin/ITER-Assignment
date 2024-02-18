// Argument Array of Size 5


#include<stdio.h>


// Line 8 Changed from Prog1.c
int main(int argc, char **argv[]){
	printf("CMD LINE\n");
	printf("Total No of Arguments %d\n",argc);
	for(int i=0 ; i<=5 ; i++){
		printf("argc[%d]=====>%s\n",i,argv[i]);
	}

	for(int i=0 ; i<=5 ; i++){
		//printf("argc[%d]=====>%s\n",i,argv[i]);
	}
	
//	for(int i=0 ; i<=sizeof(argv) ; i++){
//		printf("argc[%d]=====>%s\n",i,argv[i]);
//	}
	return 0;
}
