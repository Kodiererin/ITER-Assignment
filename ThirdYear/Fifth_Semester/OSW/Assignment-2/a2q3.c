/*3. Correct the following if statement; assume the indentation is correct.
if (deduct < balance);
balance = balance - deduct;
printf("New balance is %.2f\n", balance);
else;
printf("Deduction of %.2f refused.\n",
deduct);
printf("Would overdraw account.\n");
printf("Deduction = %.2f Final balance = %.2f",
deduct, balance);
*/

#include <stdio.h>
int main()
{

    int deduct;
    int balance;

    if (deduct < balance)
    {
        balance = balance - deduct;
        printf("New balance is %.2f\n", balance);
    }
    else
    {
        printf("Deduction of %.2f refused.\n", deduct);
    }
    printf("Would overdraw account.\n");
    printf("Deduction = %.2f Final balance = %.2f",
           deduct, balance);

    return 0;
}