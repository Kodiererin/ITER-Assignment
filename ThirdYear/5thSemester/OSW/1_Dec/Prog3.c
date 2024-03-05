#include<stdio.h>
#include<unistd.h>
int main(){
	pid_t  pid;
	//printf("Before \n");
	fprintf(stderr,"Before ");
	//pid = fork();
	fork();
	//printf("Hi\n");
	fprintf(stderr,"Hi ");
	//printf("%d\n",pid);
	return 0;
}
