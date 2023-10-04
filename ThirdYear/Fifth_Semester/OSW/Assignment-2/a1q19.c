/*19. A C program contains the following declarations and initial assignments:
int i= 8;
int j = 5;
float x = 0.005;
float y = -0.01;
char c = ’c’ , d = ’d ’ ;
Determine the value of each of the following expressions. Use the values initially assigned to the
variables for each expression.
*/

/* -- TO BE FIXED LATER */
#include<stdio.h>
int main(){
	int i= 8;
	int j = 5;
	float x = 0.005;
	float y = -0.01;
	char c = 'c' ;
	char d = 'd' ;
	
	printf("%d\n",((3*i-2*j)%(2 *d - c)));
	printf("%d\n",((x>y)&&(i>0)&&(j<5)));
	printf("%f\n",(2*x+(y==0)));
	printf("%d\n",(2*x+y)==0);
	printf("%d\n",(5*(i+j)>'c'));
	printf("%d\n",(i++));
	
	return 0;
}
