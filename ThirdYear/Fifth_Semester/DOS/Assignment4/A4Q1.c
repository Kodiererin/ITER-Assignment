#include <stdlib.h>
#include <stdio.h>

int main(){
    pid_t pid;
    if(pid<0){
        printf("Fork Failed\n");
        exit(0);
    }else if(pid==0){
        printf("Child: PID %d\n",getpid())
        while(1){}
    }
}