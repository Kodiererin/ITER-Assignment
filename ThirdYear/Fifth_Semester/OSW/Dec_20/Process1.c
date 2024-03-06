#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
// Chain of Process.
int main(int argc , char *argv[]){
	pid_t pid;
	if(argc<2){
		fprintf(stderr,"Enter the No of times you want to run\n");
		return 1;
	}
	int n = atoi(argv[1]);			// to convert string to number.
	int i;
	
	for(i=1 ; i<n ; i++){
		pid = fork();
		if(pid==0){
			//fprintf(stderr,"This is Child\n %d",i);
		}else{
			//fprintf(stderr,"This is a Parent\n %d",i);
	//		sleep(2);
			break;
		}
	}
	fprintf(stderr,"i=%d PID = %ld PPID=%ld ChildPID = %ld \n",i,(long)getpid() , (long)getppid() , (long)pid);
	
	while(1);
	//char ch = getchar();
	return 0;
}
