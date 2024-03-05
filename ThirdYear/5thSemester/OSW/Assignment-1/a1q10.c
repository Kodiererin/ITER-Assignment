/*10. Evaluate each of the following expressions if a is 6 , b is 9 , c is 14 , and flag is 1 . Which parts of
these expressions are not evaluated due to short-circuit evaluation?*/

#include<stdio.h>
int main(){
	int a = 6;
	int b = 9;
	int c = 14;
	int flag = 1;
	
	printf("%d",(c== a+b || !flag));
	printf("%d",(a !=7 && flag||(c>=6)));
	printf("%d",(!(b<=12)&&(a%2==0)));
	printf("%d",!(a>5 || c<a+b));
	
	return 0;
}
