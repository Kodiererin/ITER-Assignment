// WAP to get a Number and Using Meta Characters.
// only * will not be interpreted and will return the garbage Value

#include<stdio.h>
 int main(){
 	int a=4;
 	
 	int age;
 	int anyNo;
 	char name[10];
 	
 	
 	
 	scanf("ITER %d",&a);
 	printf("%d\n",a);
 	
 	// Error in the unsigned Operator.
 	
 	printf("\nEnter Your Age , Any Number , Your Name\n");
 	scanf("%u %d %s",&age,&anyNo,name);
  	printf("Your Name is %s\nYour Age is %u\nAny Number You Typed is %d\n",name,age,anyNo);
 	
 	
 	return 0;
 }
