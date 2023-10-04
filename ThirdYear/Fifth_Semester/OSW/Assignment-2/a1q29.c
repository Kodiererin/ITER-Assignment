/*29. verify the output/ error of the following code snippet;
int i=2,j=0;
int k=i&&j=1;
printf("%d\n",k);*/

#include <stdio.h>
int main(){
    int i=2;
    int j=0;
    int k= i && j = 1;
    printf("%d\n",k);
    return 0;
}

// This will throw an error ie: 1value as left operand of assignment 
// int k= i && j = 1;