#include<stdio.h>
int main(){
	int i1 = 345;
	float fb = 4.5;
	char c = 'Z';
	
	printf("%d %f %c ",i1,fb,c);
	printf("\n%p %p %p ",&i1,&fb,&c);
	return 0;
}
