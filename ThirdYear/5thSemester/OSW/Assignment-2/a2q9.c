/*9. Determine life expectancy of a standard light bulb given the input watts; 35, 45, 76, 120 respectively.
switch (watts) {
case 25:
life = 2500;
break;
case 40:
case 60:
life = 1000;
break;
case 75:
case 100:
life = 750;
break;
default:
life = 0;
}
*/

#include <stdio.h>
int main()
{
    int watts;
    scanf("%d", &watts);
    int life;

    switch (watts)
    {
    case 25:
        life = 2500;
        break;
    case 40:
    case 60:
        life = 1000;
        break;
    case 75:
    case 100:
        life = 750;
        break;
    default:
        life = 0;
    }

    printf("%d",life);

    return 0;
}