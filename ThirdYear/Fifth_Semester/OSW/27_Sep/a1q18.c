/* 18. The following program shows the placement of flags(i.e 	-, 		+, 0, space, #) in printf format string just
	after the symbol % to get some specific affects in the 		appearance of 	the printf output.
*/

// Proceed from Here.

#include<stdio.h>
int main(){
	int i=345;
	float x = 34.0 , y = -5.6;
	printf(":%6d:	:%7.0f:	:%10.1e:\n",i,x,y);
	printf(":%-6d:	:%-7.0f:	:%-10.1e:\n",i,x,y);
	printf(":%+6d:	:%+7.0f:	:%+10.1e:\n",i,x,y);
	printf(":%-+6d:	:%+7.0f:	:%+10.1e:\n",i,x,y);
	return 0;
}
