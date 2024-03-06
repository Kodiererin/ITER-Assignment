/*
		4. What does the following algorithm approximate? (Assume m > 1, e > 0).
	The program computes
	x = m; y = 1;
	while (x - y > e){
	x = (x + y) / 2;
	y = m/x;
	}
	printf("%d",x);
*/

#include<stdio.h>

int main(){
	int x;
	int m;
	scanf("%d",&m);
	int y;
	float  e = 2.71828;
	x = m; y = 1;
	while (x - y > e){
	x = (x + y) / 2;
	y = m/x;
	}
	printf("%d",x);
	return 0;
}

/*Log M*/
