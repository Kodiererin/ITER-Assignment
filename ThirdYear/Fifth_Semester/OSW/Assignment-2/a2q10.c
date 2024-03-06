/*10. C relational and equality operators give a result of 1 for true and 0 for false. Evaluate the following
expression for different values of x. Also write the statement to avoid such common error.
if (0 <= x <= 4)
printf("Condition is true\n");*/

#include<stdio.h>
int main(){
    int x = -35;
    if (0 <= x <= 4)
printf("Condition is true\n");

if (x>=0 && x<=4)
      printf("Condition is true\n");

    return 0;
}