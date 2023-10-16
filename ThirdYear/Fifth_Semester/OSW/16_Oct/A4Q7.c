/*
	7. Consider the following C function;
	int fun(n){
	int i,j;
	for(i=1;i<=n;i++){
	for(j=1;j<n;j++){
	printf("%d %d\n",i,j);
	}
	}
	return 1;
	}
*/

#include<stdio.h>
int main(){
	fun(5);
	return 0;
}

int fun(n){
	int i,j;
	for(i=1 ; i<=n ; i++){
		for(j=1 ; j<n ; j++){
			printf("%d %d\n",i,j);
		}
	}
	return 1;
}
