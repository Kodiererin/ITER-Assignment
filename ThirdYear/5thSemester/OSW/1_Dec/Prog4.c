#include<stdio.h>
#include<unistd.h>
int main(){
	//int x  = fork() || fork();
	int x  = fork() && fork();
	printf("Hi -- %d\n",x);
}
