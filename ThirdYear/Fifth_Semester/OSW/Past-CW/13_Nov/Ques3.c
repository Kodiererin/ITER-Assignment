/*
	WAP to create a Calculator
*/

#include<stdio.h>

void calculator();
void add();
void sub();
void mul();
void div();


void calculator(){
	printf("::::::::::::::::::::::::::::::::::::::::::::::::\n");	
	printf("Enter Your Choice : \n1. Addition \n2. Substraction \n3. Multiplication \n4. Division\n");
	int ch;
	scanf("%d",&ch);
	switch(ch){
		case 1 : {
			add();
			break;
		}
		case 2 : {
			sub();
			break;
		}
		case 3 : {
			mul();
			break;
		}
		case 4 : {
			div();
			break;
		}
		default : {
			printf("Invalid Input ");
			break;
		}
	}
	printf("::::::::::::::::::::::::::::::::::::::::::::::::\n");
}


void add(){
	int x;
	int y;
	printf("Enter 2 Number to add");
	scanf("%d",&x);
	scanf("%d",&y);
	printf("%d",(y+x));
	main();
}


void sub(){
	int x;
	int y;
	printf("Enter 2 Number to sub");
	scanf("%d",&x);
	scanf("%d",&y);
	printf("%d\n",(y-x));
}


void mul(){
	int x;
	int y;
	printf("Enter 2 Number to mul");
	scanf("%d",&x);
	scanf("%d",&y);
	printf("%d\n",(y*x));
}


void div(){
	int x;
	int y;
	printf("Enter 2 Number to divide");
	scanf("%d",&x);
	scanf("%d",&y);
	if(x!=0 && y!=0){
		printf("Quotient %d\n",(x/y));
		printf("Remainder %d\n",(x%y));
	}else{
		printf("Invalid Input \n");
	}
}



int main(){
	calculator();
	return 0;
}
