#include<stdio.h>
#include<stdlib.h>

#define ujjwal 10

int x = 20;

int main(){
    printf("%d",x);
    // Playing with the array.
    int ujjwalArray[ujjwal];
    printf("The size of the array is %d\n",sizeof(ujjwalArray));
    int *u = &ujjwalArray[0];

    // int *v = &(*u);
    int *(*v) = &u;

    printf("The size of the pointer is %d\n",sizeof(u));
    for(int i=0 ; i<ujjwal ; i++){
        *(*(v)+i) = i;
        printf("The Data in the pointer is %d\n",*(v+i));
    }
    printf("\nHello World\n");
    for(int i=0 ; i<ujjwal ; i++){
        printf("Data output is %d\n",*(u+i));
    }
}