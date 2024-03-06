/*6. Consider the following C expressions;
(a) Suppose that i is an integer variable whose value is 7,
and f is a floating-point variable whose value is 8.5. The
expression (i + f )%4 is valid or invalid.*/

#include<stdio.h>
int main(){
	int i = 7;
	float f = 8.5;
	printf("%d",(int)(i+f)%4);
	//printf("%d",(i+f)%4); -This statement is Invalid because % returns integer value and there are two numbers integer and float. So this might create an error.
	return 0;
}
