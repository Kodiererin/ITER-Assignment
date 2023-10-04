/*13. Keiths Sheet Music needs a program to implement its music teachers discount policy. The program is
to prompt the user to enter the purchase total and to indicate whether the purchaser is a teacher. The
store plans to give each customer a printed receipt, so your program is to create a nicely formatted file
called receipt.txt. Music teachers receive a 10% discount on their sheet music purchases unless the
purchase total is $100 or higher. In that case, the discount is 12%. The discount calculation occurs
before addition of the 5% sales tax. Here are two sample output filesone for a teacher and one for a
nonteacher.
Total purchases $122.00
Teacher’s discount (12%) 14.64
Discounted total 107.36
Sales tax (5%) 5.37
Total $112.73
Total purchases $24.90
Sales tax (5%) 1.25
Total $26.15
Note: to display a % sign, place two % signs in the format string:
printf("%d%%", SALES_TAX);
To write the output in the file receipt.txt use output redirection, ./a.out > receipt.txt*/

#include<stdio.h>

int main() {
    printf("Enter The Total Amount\n");
    float totAmt;
    scanf("%f", &totAmt);

    printf("Are You a Teacher? 0-No | 1-Yes\n");
    int isTeacher;
    scanf("%d", &isTeacher);

    float teaDiscount;
    float disTotal;
    float salesTax1;
    float total;

    if (isTeacher == 1) {
        if (totAmt > 100) {
            teaDiscount = totAmt * (12.0 / 100);
        } else {
            teaDiscount = totAmt * (10.0 / 100);  
        }

        disTotal = totAmt - teaDiscount;
        salesTax1 = disTotal * (5.0 / 100);
        total = salesTax1 + disTotal;

        printf("Total purchases $ %.2f \nTeacher's discount $%.2f \nDiscounted total $%.2f \nSales tax (5%%)$%.2f \nTotal $ %.2f\n", totAmt, teaDiscount, disTotal, salesTax1, total);
    } else {
        teaDiscount = 0;
        disTotal = totAmt - teaDiscount;
        salesTax1 = disTotal * (5.0 / 100);
        total = salesTax1 + disTotal;

        printf("Total purchases $ %.2f \nSales tax(5%%) $%.2f \nTotal $ %.2f\n", totAmt, salesTax1, total);
    }
    return 0;
}
