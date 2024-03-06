#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
// Chain of Process.
int main(int argc , char *argv[]){
	pid_t pid;
	pid = fork();
	if(pid==0)// Child {
		for(int i=0 ; i<20 ; i++){
			printf("Child i=%d PID = %ld , PPID = %ld \n",i,(long)getpid(),(long)getppid());
			sleep(1);
	}
	else{
		for(int i=0 ; i<50 ; i++){
			printf("\t\tParent I = %d,Parent PID = %ld , PPID = %ld \n",i,(long)getpid(),(long)getppid());
			sleep(1);
		}
	}
	
	return 0;
}

