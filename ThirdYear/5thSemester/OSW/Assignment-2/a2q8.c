/*
8. What will be printed by this carelessly constructed switch statement if the value of color is ’R’?
switch (color) { break statements missing
case ’R’:
printf("red\n");
case ’B’:
printf("blue\n");
case ’Y’:
printf("yellow\n");
}
*/

#include <stdio.h>
int main()
{
    char color;
    scanf("%c", &color);

    switch (color)
    { /* break statements missing */
    case 'R':
        printf("red\n");
    case 'B':
        printf("blue\n");
    case 'Y':
        printf("yellow\n");
    }
    return 0;
}