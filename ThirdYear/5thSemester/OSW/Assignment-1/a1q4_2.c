/*4-b : (b) Store the absolute difference of x and y in y , where the absolute difference is ( x - y ) or
(y - x ), whichever is positive. Do not use the abs or fabs function in your solution.*/

#include<stdio.h>
int main(){
	int x;
	int y;
	scanf("%d %d ",&x,&y);
	x = (x-y)>0?(x-y):(y-x);
	printf("%d\n",x);
}
