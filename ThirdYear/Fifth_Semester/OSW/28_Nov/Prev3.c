#include<stdio.h>
#include<stdlib.h>
// Check this code there an error exists.
// Array of arguments we have array of arguments.

int main(){
	// Shell has created an argument array.
	// But we have to create an Argument array.
	char **argp;
	argp = (char)malloc(sizeof(char *) *5);
	
	if(argp == NULL)
	{
		printf("Memory Fail ");
		exit(1);
	// argv is a double pointer of type character.
	// it is a pointer to an array of character.
	}
	// allocated the size
	int i=0;
	for(i=0 ; i<sizeof(*argp) ; i++){
		*argp[i] = malloc(sizeof(char)*5);
	}
	
	// adding a input
	for( i=0 ; i<sizeof(**argp) ; i++){
		scanf("%c",*argp[i]);
	}	
	
	// Displaying the Array
	for( i=0 ; i<sizeof(**argp) ; i++){
		printf("%c",*argp[i]);
	}	
	
	
	
	
	return 0;
}
