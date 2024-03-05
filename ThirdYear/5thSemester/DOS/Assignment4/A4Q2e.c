#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int main( ) 
         { 
           pid_t pid; 
           int i=5; 
           pid=fork(); 
           if(pid==0) 
          { 
              i=i+1; 
              printf("Child: %d",i); 
           } 
            else 
           { 
             wait(NULL); 
             printf("Parent: %d",i); 
            } 
            return 0; 
           } 