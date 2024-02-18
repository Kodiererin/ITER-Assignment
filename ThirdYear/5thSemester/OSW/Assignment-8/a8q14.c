// Printing the Fibonacci Series.

#include<stdio.h>
#include<stdlib.h>

void fibo(int , int , int );

int main(){
    int n;
    scanf("%d",&n);
    printf("0\n");
    fibo(0,1 , n);
}

void fibo(int x , int y , int n){
    if(n==0){
        return;
    }else{
        printf("%d\n ",y);
        fibo(y,x+y,n-1);
    }
}