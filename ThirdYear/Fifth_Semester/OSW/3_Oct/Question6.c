// Write A Program to do the following operation
#include<stdio.h>
int main(){
	int marks;
	printf("Enter Your marks \n");
	scanf("%d",&marks);
	
	char grade = marks>=90?'O':marks>=80 && marks<=90?'A':marks>=70 && marks<=80?'B':marks>=60 && marks<=70?'C':marks>=50 && 		marks<=60?'D':marks>=40 && marks<=50?'E':marks>0?'F':'z';
	
	grade=='z'?printf("Invalid Input"):printf("%c",grade);
};

