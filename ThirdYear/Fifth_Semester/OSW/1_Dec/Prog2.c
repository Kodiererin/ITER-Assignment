#include<stdio.h>
#include<unistd.h>
int main(){
	printf("Process Id = %ld\n" , (long) getpid());
	printf("Parent Process Id = %ld\n" , (long) getppid());
	char ch = getchar();
	return 0;
}
