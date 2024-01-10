// Finding the Binary equivalent

#include<stdio.h>
#include<stdlib.h>

void binary(int);

int main(){
    int m;
    scanf("%d",&m);
    printf("Printing Binary");
    binary(m);
}

void binary(int m){
    if(m==0){
        return;
    }
    else{
        printf("\n%d ",m%2);
        binary(m/2);
    }
}
