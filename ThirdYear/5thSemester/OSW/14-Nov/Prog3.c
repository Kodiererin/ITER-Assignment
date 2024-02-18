#include<stdio.h>
#include<stdlib.h>


void add(int , int , int *);
void sub(int , int , int *);
void mul(int , int , int *);

int main(){
	int x;
	int y;
	int *z;
	x = 10;
	y = 20;
	
	void (*a)(int , int , int *);
	void (*s)(int , int , int *);
	void (*m)(int , int , int *);

	a=add(x,y,z);
	s=sub(x,y,z);
	m=mul(x,y,z);
	
	printf("The addition function is at location : %p and value of z is %d \n",a,*z);
	printf("The Substraction function is at location : %p and value of z is %d \n",s,*z);
	printf("The multiplication function is at location : %p and value of z is %d \n",m,*z);
	
}

void add(int x , int y , int *z){
	*z = x+y;
}

void mul(int x , int y , int *z){
	*z = x*y;
}

void sub(int x , int y , int *z){
	*z = x-y;
}
