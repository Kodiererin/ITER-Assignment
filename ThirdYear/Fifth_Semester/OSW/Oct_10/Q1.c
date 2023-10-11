// WAP to print the multiplication of Tables using Different Loops

#include<stdio.h>
int main(){
	int x;
	printf("Enter The Number \n");
	scanf("%d",&x);
	int i=0;
	do{
		printf("%d\tX\t%d\t=\t%d\n",x,i,x*i);
		i++;
	}while(i<=10);
	return 0;	
}
