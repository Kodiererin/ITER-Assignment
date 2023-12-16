#include<stdio.h>

extern int count;
void writeExtern(){
    int count = count+10;
    printf("%d\n",count);
}