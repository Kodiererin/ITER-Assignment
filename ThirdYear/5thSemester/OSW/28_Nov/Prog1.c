#include<stdlib.h>
#include<stdio.h>

int main(){
	char **argp;
	argp = (char **) malloc(sizeof(char *)*5);
	// Proceeding 
	*(argp +0) = "ITER";
	*(argp +1) = "SOA";
	*(argp +2) = "Hello";
	
	if(argp==NULL){
		printf("Memory Fail \n");
		exit(1);
	}
	
	// This is the Focus point.
	printf("%d \n",sizeof(argp));
	for(int i=0 ; argp[i]!=NULL ; i++){
		printf("%s",argp[i]);
	}
	printf("\n");
	
	for(int i=0 ; argp[i]!=NULL ; i++){
		for(int j=0 ; argp[i] !=NULL ; j++){
				//printf("%s",argp[i][j]);
		}
		printf("\n");
	}
	return 0;
}

