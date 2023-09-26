// Testing SCANF and PRINTF


#include<stdio.h>
int main(){
 
 	int m = printf("Hello World");
 	printf("\n%d\n",m);
 	
 	int o;
 	printf("\nEnter a Number \n");
 	int n = scanf("%d",&o);
 	printf("\n%d\n",o);
 	printf("%d\n",n);
 	
 	
 	char name[10];
 	printf("\nEnter a Name \n");
 	int n1 = scanf("%s",name);
 	printf("%d\n",n1);
 }
