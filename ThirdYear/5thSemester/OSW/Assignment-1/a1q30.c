/*30. Find the output of the following code snippet;
int i=2,j=2;
int k=iˆj&i;
printf("%d\n",k);*/

#include<stdio.h>

int main(){
int i=2,j=2;
int k=i^j&i;
printf("%d\n",k);
    return 0;
}