/*15. Suppose that x, y and z are integer variables which have been assigned the values 2, 3 and 4, respec-
tively. Determine the value of the given expression;*/

#include<stdio.h>
int main(){
	int x=2,y=3,z=4;
	x*=-2*(y+z)/3;
	
	printf("%d",x);
	return 0;
}
