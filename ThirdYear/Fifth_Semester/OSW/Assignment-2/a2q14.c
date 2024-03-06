/*14. A particular cell phone plan includes 50 minutes of air time and 50 text messages for $15.00 a month.
Each additional minute of air time costs $0.25, while additional text messages cost $0.15 each. All
cell phone bills include an additional charge of $0.44 to support 911 call centers, and the entire bill
(including the 911 charge) is subject to 5 percent sales tax.
Write a program that reads the number of minutes and text messages used in a month from the user.
Display the base charge, additional minutes charge (if any), additional text message charge (if any),
the 911 fee, tax and total bill amount. Only display the additional minute and text message charges if
the user incurred costs in these categories. Ensure that all of the charges are displayed using 2 decimal
places.*/

#include<stdio.h>

int main() {
    printf("Enter The Number of Minutes: \n");
    int minutes;
    scanf("%d", &minutes);

    printf("Enter the Number of Text Messages: \n");
    int messages;  
    scanf("%d", &messages);

    float cost = 15.00;  
    float additionalCost = 0.00;


    if (minutes > 50) {
        additionalCost += (minutes - 50) * 0.25;
    }


    if (messages > 50) {
        additionalCost += (messages - 50) * 0.15;
    }

    float supportCharge = 0.44;
    float totalCost = cost + additionalCost + supportCharge;
    float tax = 0.05 * totalCost;  


    totalCost += tax;

    printf("Basic Cost: %.2f\n", cost);
    if (additionalCost > 0) {
        printf("Additional Usage Cost: %.2f\n", additionalCost);
    }
    printf("Support Charge: %.2f\n", supportCharge);
    printf("Tax: %.2f\n", tax);
    printf("Total Cost: %.2f\n", totalCost);

    return 0;
}
