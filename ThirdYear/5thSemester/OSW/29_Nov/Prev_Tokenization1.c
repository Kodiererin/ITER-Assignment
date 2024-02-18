#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(){
	char str[] = "ITER-CSE-MECH";
	char *ptr;
	char *rem;
	char *delimeter = "-";
	 ptr = strtok(str,delimeter);
	 //printf("%s",strtok(str,"-"));
	 rem = strtok(NULL,delimeter);
	 printf("String Now is -  %s\n",str);
	printf("Token Now is -%s\n  ",ptr);
	printf("Token Now is -%s\n  ",rem);
	return 0;
}

