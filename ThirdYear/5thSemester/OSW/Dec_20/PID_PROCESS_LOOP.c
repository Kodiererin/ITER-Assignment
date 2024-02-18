#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
// Process in a Loop

int x = 10;			// Global for all Program but parent child cannot share x

int main(){
	pid_t pid;	
	for(int i=0 ; i<4; i++){
		fork();
	}
	getchar();
	return 0;
}
