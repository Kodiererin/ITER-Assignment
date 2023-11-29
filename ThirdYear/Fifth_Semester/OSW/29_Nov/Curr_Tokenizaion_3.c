#include<string.h>
#include<stdlib.h>
#include<string.h>



int makeargv(const char * s , const char * d ,const char ***argvp)

int makeargv(const char * s ,const char * d , char ***argvp){
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
