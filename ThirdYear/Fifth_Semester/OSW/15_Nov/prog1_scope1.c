#include<stdio.h>

int add(int , int );
int show();
static int a = 10;
 int c = 199;
int main(){
	
	printf("Function Show : main%d\n",a);
	a = add(a,10);
	printf("Function Show : main%d\n",a);
	a = 20;
	printf("Function Show : main%d\n",a);
	printf("Function Show : main : The Value of c %d\n",c);
	extern c = 201;
	return show();
}


int add(int x,int y){
	printf("%d\n",a);
	printf("Function Show : Add The Value of c %d\n",c);
	return x+y;
	}
	
int show(){
	static int a = 100;
	static int b = 200;
	printf("Function Show%d\n",a);
	printf("Function Show: The Value of c %d\n",c);
	return 0;
}
