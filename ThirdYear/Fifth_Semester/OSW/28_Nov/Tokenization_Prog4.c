#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(){
	char str[] = "ITER-CSE-MECH";
	char vtr[] = "IIIT-IIT-IT";
	char *ptr , *tok;
	
	printf("Original String = %s\n",str);
	ptr = strtok(str,"+-");
	tok = strtok(vtr,"+-");
	printf("Intial Token = %s\n",vtr);
	while(ptr!=NULL){
		printf("Token = %s\n",ptr);
		ptr = strtok(NULL,"+-");
	}
	return 0;
}


// Not thread Safe.

