/*14. C also contains other form assignment operators: +=, -+, *=, /=, %= etc., called short hand operators.
Suppose that i and j are integer variables whose values are 5 and 7, and f and g are floating-point
variables whose values are 5.5 and -3.25. Determine the value of the expressions*/

#include<stdio.h>
int main(){
	int i = 5;
	int j = 7;
	float f = 5.5;
	float g = -3.25;
	
	i += 5;
	f -= g;
	j *= ( i - 3);
	f /= 3;
	i %= ( j - 2 );
	
	printf("%d\n",i);
	printf("%d\n",j);
	printf("%f\n",f);
	
	return 0;
}
