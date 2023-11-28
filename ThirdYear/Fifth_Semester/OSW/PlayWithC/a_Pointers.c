// Understanding pointers

#include<stdio.h>
#include<stdlib.h>

int main(){
    // int * ptr = calloc(10,sizeof(int));
    int * ptr = (int *)malloc(10*sizeof(int));
    for(int i=0 ; i<10 ; i++){
        *(ptr+i) = i;
    }
    for(int i=0 ; i<10 ; i++){
        printf("%d\n",*(ptr+i));
    }
    
}

//In this the difference between calloc and malloc is that calloc returns the actual pointer needed
/*
 *  Like I need integer pointer so I provided the size and its type and so it gave me the the pointer of that type.
 *  Whereas in Malloc , malloc returns the void pointer which then we have to typecast of to a specific type. 
*/