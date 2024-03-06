#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
// Write a c implementation to show the critical section problem,

int x = 10;			// Global for all Program but parent child cannot share x

int main(){
	pid_t pid;	
//	int x=10;	// Local for the Program with respect to all the process.
	pid = fork();
	char cstr[] = "i am child";
	char parent[] = "I AM PARENT";
	if(pid==0){
		for(int i=0 ; i<100 ; i++){
			for(int j=0 ; cstr[j]!='\0' ; j++)
				fprintf(stderr,"%c",cstr[j]);
			//fprintf("\tchild : The Value of x when it is child is %d\n\n",x);
			sleep(1);
		}
	}
	else{
		for(int i=0 ; i<100 ; i++){
			for(int j=0 ; parent[j]!='\0' ; j++)
				fprintf(stderr,"%c",parent[j]);
			//fprintf("\tchild : The Value of x when it is child is %d\n\n",x);
			sleep(1);
		}
	}
	return 0;
}
