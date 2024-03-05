/*12. Write a switch statement that assigns to the variable lumens the expected brightness of a standard
light bulb whose wattage has been stored in watts. Assign 1 to lumens if the value of watts is not in
the table.Use this table:
Watts Brightness (in Lumens)
15 125
25 215
40 500
60 880
75 1000
100 1675*/

#include <stdio.h>
int main()
{
    int watts;
    int brightness;
    scanf("%d", &watts);

    switch (watts)
    {
    case 15:
    {
        brightness = 125;
        break;
    }

    case 25:
    {
        brightness = 215;
        break;
    }
    case 40:
    {
        brightness = 500;
        break;
    }
    case 60:
    {
        brightness = 880;
        break;
    }
    case 75:
    {
        brightness = 1000;
        break;
    }
    case 100:
    {
        brightness = 1675;
        break;
    }

    default:
    {
        brightness = 1;
        break;
    }
    }

    printf("Watts : %d\n", watts);
    printf("Brightness : %d Lumens \n", brightness);
    return 0;
}