/*16. The assignment statement that contains a conditional expression on the right-hand side. Determine
the value of flag if i=-5 and i=-6 respectively.*/

#include<stdio.h>
int main(){
	int i=-5;
	printf("%d",(( i < 0 ) ? 0 : 100));
	
	i=-6;
	printf("%d",(( i < 0 ) ? 0 : 100));
	
	return 0;
}
