/*6. Consider the following C expressions;
(b) Suppose that i is an integer variable whose value is 7,
and f is a floating-point variable whose value is 8.5. The
expression ((int)(i + f ))%4 is valid or invalid.*/

#include<stdio.h>
int main(){
	int i = 7;
	float f = 8.5;
	printf("%d",((int)(i+f)%4));
	return 0;
}
