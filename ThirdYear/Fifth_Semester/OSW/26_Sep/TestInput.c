// WAP to get a Number and Using Meta Characters.
// only * will not be interpreted and will return the garbage Value

#include<stdio.h>
 int main(){
 	
 	int age1;
 	//int age2;
 	int age2=10;
 	
 	printf("Enter Two Numbers\n");
 	scanf("%*d%d",&age1);
 	printf("The Numbers are %d and  %d\n",age1,age2);
 	
 	return 0;
 }
