/*31. Find the output of the following code snippet;
int i=3,j=2;
int k=i << 1 > 5;
printf("%d\n",k);*/

#include <stdio.h>
int main(){
    int i=3,j=2;
    int k = i << 1 > 5;
    printf("%d\n",k);
    return 0;
}