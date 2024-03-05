#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int x = 10;			// Global for all Program but parent child cannot share x

int main(){
	pid_t pid;	
//	int x=10;	// Local for the Program with respect to all the process.
	pid = fork();
	if(pid==0){
		for(int i=0 ; i<100 ; i++){
			x = x+10;
			printf("\tChild : I am child , my PID is %ld and my PPID is  , %ld \n",(long)getpid() , (long)getppid());
			printf("\tchild : The Value of x when it is child is %d\n\n",x);
		}
		sleep(1);
	}
	else{
		for(int i=0 ; i<100 ; i++){
			x = x*2;
			printf("Parent : I am Parent  my PID is %ld , and my PPID is  %ld \n",(long)getpid() , (long)getppid());
			printf("Parent : The Value of x when it is Parent is %d\n\n",x);
		}
		sleep(1);
	}
	return 0;
}
