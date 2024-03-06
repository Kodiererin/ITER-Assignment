// WAP to get a Number and Print the Number
// Here We used Precison ie: %10d where 10 is the Spaces
// Here We also Used Character as we took the input in string //because we used character[] array which is String
// We are also using %.5s where .5 means how many characters we want to show

#include<stdio.h>
 int main(){
 	char intro[] = "Welcome To the Console\n\n";
	printf("%.7s",intro);
 	
 	int x;
 	char name[10];

 	
 	printf("Enter A Age \n");
 	scanf("%d",&x);
 	
 	
 	printf("\nEnter Your Full Name - \n");
 	scanf("%s",name);
 	printf("The Age  You Entered Is :%10d: \n",x);
 	printf("\nYour Name is :%10s:  \n",name);
 	return 0;
 }
