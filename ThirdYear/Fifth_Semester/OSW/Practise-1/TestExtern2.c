#include "TestExtern.c"
#include<stdio.h>

extern int m;

int main(){
    int count =5;
    writeExtern();
    writeExtern();
    printf("%d\n",count);
    printf("%d\n",m);
}