/*2. During execution of the following program segment, how many lines of hash marks are displayed?*/

#include<stdio.h>
int main(){
int m , n;
int ctr=0;
	for (m = 9; m > 0; --m)
	for (n = 6; n > 1; --n){
		printf("#########\n");
		ctr++;
	}
	printf("%d",ctr);
	
	return 0;
}
