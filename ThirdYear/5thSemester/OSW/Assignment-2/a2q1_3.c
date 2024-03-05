/*1. Find the value that is assigned to x when y is 10.0.
Code snippet: 1(a)
x = 25.0;
if(y != (x - 10.0))
x = x - 10.0;
else
x = x / 2.0;
*/

#include <stdio.h>
int main()
{
    float x;
    float y;
    x = y = 10;
    if (y < 15.0 && y >= 0.0)
        x = 5 * y;
    else
        x = 2 * y;

    printf("%f\n", x);
    printf("%f\n", y);
    return 0;
}