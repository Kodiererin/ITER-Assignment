/*1. Find the output/ error of following code snippet*/

#include<stdio.h>
int main(){
float x = 1.1 ;
while ( x == 1.1 ) {
printf ( "%f\n", x ) ;
x = x - 0.1 ;
}
	return 0;
}
