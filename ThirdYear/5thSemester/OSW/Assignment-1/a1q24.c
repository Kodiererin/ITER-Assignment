/*24. State the output of the following code snippet;
int a,b,s;
s=scanf("%d%d%d",&a,&b,&a);
printf("%d\n",s+printf("OSW CSE="));
*/

#include <stdio.h>
int main(){
    int a,b,s;
    s=scanf("%d%d%d",&a,&b,&a);
    printf("%d\n",s+printf("OSW CSE="));
    return 0;
}