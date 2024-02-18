#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(){
	char *str = "    ITER+CSE+MECH";
	printf("String Before = %s\n",str);
	printf("Char  = %c\n",str[10]);
	
	int pl = strspn (str," ");
	// We are just incrementing the String index and then displaying. 
	// Just Index is being incremented.
	str = str+pl;
	printf("%d\n",pl);
	printf("%s\n",str);
	return 0;
}

