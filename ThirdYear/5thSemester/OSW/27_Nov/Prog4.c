#include<stdio.h>
#include<stdlib.h>

// Array of arguments we have array of arguments.

int main(){
	// Shell has created an argument array.
	// But we have to create an Argument array.
	char **argv[5];
	// argv is a double pointer of type character.
	argv[0] = "ITER" ; // Pointing to array of Characters.
	argv[1] = "SOA";
	argv[2] = "CSE";
	argv[3] = "Null";
	int i=0;
	do{
		printf("argv[%d] ===> %c\n",i,*argv[i]);
		for(int j=0 ; j<sizeof(argv[i]) ; j++){
			//printf("%c",argv[i][j]);
		}
		printf("\n");
		i=i+1;
	}while(i<4);
	
	
	
	return 0;
}
