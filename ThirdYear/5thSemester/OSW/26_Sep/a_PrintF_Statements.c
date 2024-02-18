// Write a Program to read two Numbers from the Keyboard & Display The Two Numbers Using PrintF

// Input Style
// 1. 10,20 Seperated by Commas
// 2. 10,20 Seperated by Enter
// 3. 10-20 where the numbers are seperated by -
// 4. 10,20 where the numbers are seperated by ,
// 5. 10$20 whrer the numbers are seperated by $

#include<stdio.h>
 int main(){
 	// Seperated By Commas
 	int age1, age2;
 	
 	// Seperated By Enter
 	int age3,age4;
 	
 	// Seperated By -
 	int age5,age6;
 	
 	// Seperated By ,
 	int age7,age8;
 	
 	// Seperated by $
 	int age9 , age10;
 	
 	
 	char temp[1];
 	
 	printf("Enter Two Numbers\n");
 	scanf("%d%d",&age1,&age2);
 	
 	
	printf("Enter Two Numbers\n");
 	scanf("%d%d",&age3,&age4);
 	
	printf("Enter Two Numbers\n");
 	scanf("%d%c%d",&age5,temp,&age6);
 	
	printf("Enter Two Numbers\n");
 	scanf("%d%c%d",&age7,temp,&age8);
 	
 	
 	// There are 2 Ways and this is the Second way.
	printf("Enter Two Numbers\n");
 	scanf("%d%*c%d",&age9,&age10);
 	
 	
 	printf("The Numbers are %d and  %d\n",age1,age2);
 	printf("The Numbers are %d and  %d\n",age3,age4);
 	printf("The Numbers are %d and  %d\n",age5,age6);
 	printf("The Numbers are %d and  %d\n",age7,age8);
 	printf("The Numbers are %d and  %d\n",age9,age10);
 	
 	return 0;
 }
