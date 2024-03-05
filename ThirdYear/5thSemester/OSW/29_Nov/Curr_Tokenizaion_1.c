// Creating argument array.

#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(){
	char **argp;
	char str[] = "ITER-SOA-CSE";
	char delim[] = "-";
	// Dividing the Character to Tokens
	argp = (char **) malloc(4*sizeof(char * ) );
	
	// putting the tokens
	
	*(argp + 0) = strtok(str,delim);
	*(argp + 1) = strtok(NULL,delim);
	*(argp + 2) = strtok(NULL,delim);
	*(argp + 3) = NULL;
	
	for(int i=0 ; argp[i]!=NULL; i++){
		printf("argp[%d] ====> %s\n",i,argp[i]);
	} 
	
	return 0;
}

