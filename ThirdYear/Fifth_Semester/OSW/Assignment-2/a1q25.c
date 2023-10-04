/*25. State the output of the following code snippet;
int i=-1,j=-1,k=0,l=2,m;
m=++i || k++ && ++j || l++;
printf("%d %d %d %d %d\n", i,j,k,l,m);*/

#include <stdio.h>

int main(){
    int i=-1,j=-1,k=0,l=2,m;
    m=++i || k++ && ++j || l++;
    printf("%d %d %d %d %d\n", i,j,k,l,m);
    return 0;
}