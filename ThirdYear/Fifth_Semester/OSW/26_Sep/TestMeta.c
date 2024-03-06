// WAP to get a Number and Using Meta Characters.
// only * will not be interpreted and will return the garbage Value

#include<stdio.h>
 int main(){
 	char intro[] = "Welcome To the Console\n\n";
	printf("%s",intro);
 	
 	int x;
 	printf("Enter A Number \n");
 	scanf("%d",&x);
 	
 	float y;
 	printf("Enter Your Age in Year And Months.");
 	scanf("%f",&y);
 	
 	//printf("The Age  You Entered Is :%*d: \n",x); 
 	printf("The Age  You Entered Is %*d\n",5,x); 
 	printf("The Age  You Entered Is %*.*d\n",5,10,x); 
 	
 	
 	printf("The Age in Years and Months You Entered Is %*f\n",5,y); 
 	printf("The Age in Years and Months You Entered Is %*.*f\n",5,10,y); 
 	return 0;
 }
