#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

 int main( ) 
          { 
           int i=5; 
           fork(); 
           i=i+1; 
           fork(); 
           fprintf ( stderr,"% d",i); 
           return 0; 
          }