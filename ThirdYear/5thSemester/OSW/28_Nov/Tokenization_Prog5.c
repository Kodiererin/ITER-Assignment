#include<stdlib.h>
#include<stdio.h>
#include<string.h>

// Using strtok_r

int main(){
	//char str[] = "ITER-CSE-MECH";
	char vtr[] = "IIIT-IIT-IT";
	char *ptr , *tok;
	
	printf("Original String = %s\n",vtr);
	ptr = strtok_r(vtr,"+-" , &tok);
	//tok = strtok(vtr,"+-");
	printf("Remaining String  = %s\n",tok);
	while(ptr!=NULL){
		printf("Token = %s\n",ptr);
		ptr = strtok_r(NULL,"+-"  , &tok);
		
	}e
	return 0;
}


// Not thread Safe.

