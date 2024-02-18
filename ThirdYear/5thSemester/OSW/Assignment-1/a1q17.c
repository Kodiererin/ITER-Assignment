/*17. In the following assignment statement, a, b and c are assumed to be integer variables. If a, b and
c have the values 1, 2 and 3, respectively, then determine the value of the expression that includes
operators of different precedence groups.*/

#include<stdio.h>
int main(){
	int a=1,b=2,c=3;
	c += (a > 0 && a <= 10) ? ++a : a / b ;
	printf("%d",c);
	return 0;
}
