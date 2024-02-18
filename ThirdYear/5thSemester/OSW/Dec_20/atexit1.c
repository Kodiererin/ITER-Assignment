#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
// Chain of Process.
int main(int argc , char *argv[]){
	pid_t pid;
	pid = fork();
	if(pid==0){// Child {
		for(int i=0 ; i<5 ; i++){
			printf("Child i=%d PID = %ld , PPID = %ld \n",i,(long)getpid(),(long)getppid());
			sleep(1);
	}
	
	}
	else{
	int status;
		for(int i=0 ; i<30 ; i++){
			printf("\t\tParent I = %d,Parent PID = %ld , PPID = %ld \n",i,(long)getpid(),(long)getppid());
			sleep(1);
		}
		wait(&status);
		printf("After wait \n");
		int y = status & 0xFF;
		if(y==0){
			printf("Normal Termination \n");
			printf("Exit Status = %d\n",status>>8);
		}
		for(int i=0 ; i<30 ; i++){
			printf("\t\t\tParent i=%d",i);
			sleep(1);
		}
	}
	
	return 0;
}

