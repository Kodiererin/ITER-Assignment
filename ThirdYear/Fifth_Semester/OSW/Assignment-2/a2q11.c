/*11. Evaluate the following code snippet for different values of x.
printf("Enter x \n");
scanf("%d",&x);
if (x = 10)
printf("x is 10");
printf("Differentiate: == and =");
else
printf(" simply incorrect results");*/

#include <stdio.h>
int main()
{
    int x;
    printf("Enter x \n");
    scanf("%d", &x);
    if (x == 10)
    {
        printf("x is 10");
        printf("Differentiate: == and =");
    }
    else
        printf(" simply incorrect results");

    return 0;
}