// WAP to create a userdefined Argument array , from a Given String - "This is a String". 
// Whose prototype is given as 

// int makeArray(String , delimeter  , argumentArray)
// Returns the Number of tokens.

// Finally,Display the argument array


#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include"Curr_Tokenizaion_3.h"


//int makeargv(char * s , char *  , &myargv);
//int makeargv(char *,char *,char ***);
// call must be makeArray(str,delim,&myArray)

//int makeargv(char * s , char * d , char ***argvp)

// ALways expected that make the character and delimeter of const so that it cannot be changed

/* int makeargv(const char * s ,const char * d , char ***argvp){
	int i , ntoken;
	char *snew;
	// The address will be shifted when it encounters a space.
	snew = s+strspn(s,d);
	char *temp;
	// I want everything everything to be done by temp;
	temp = (char *) malloc((strlen(snew) + 1)*sizeof(char));
	strcpy(temp,snew);
	printf("Temp String = %s\n",temp);
	// Calculating number of tokens.
	// we can also use strtok to calculate the no of tokens 
	// else
	if(strtok(temp,d)!=NULL){
		for(ntoken=1 ; strtok(NULL,d)!=NULL ; ntoken = ntoken+1){
			
		} 
	}
	printf("The Number of Tokens  = %d\n",ntoken);
	
	*argvp = (char **) malloc((ntoken+1)*sizeof(char *));
	strcpy(temp,snew);
	
	*(*argvp+0) = strtok(temp,d);
	for(i=1 ; i<ntoken ; i++){
		*(*argvp+i) = strtok(NULL,d);
	}
	
	return ntoken<0?-1:ntoken;
}
*/



int main(int argc , char *argv[]){
	char **myargv;
	// char str[] = "This is a String";
	// Reading String from the Command Line
	
	// Some conditons.
	if(argc!=2){
		printf("Error Usage : ./a.out string\n");
		exit(1);
	}
	
	char *str = argv[1];
	char delim[] = " ";
	int ntoken = makeargv(str,delim,&myargv);
	if(ntoken==-1){
		printf("Error in the Array Created \n");
		exit(1);
	}
	printf("Ny Argument array is \n");
	for(int i=0 ; i<ntoken ; i++){
		printf("myArgv[%d] -----> %s\n",i,myargv[i]);
	}
	
	int token;
	
		
	return 0;
}

