/*15. Write a program that determines the day number (1 to 366) in a year for a date that is provided as
input data. As an example, January 1, 1994, is day 1. December 31, 1993, is day 365. December 31,
1996, is day 366, since 1996 is a leap year. A year is a leap year if it is divisible by four, except that
any year divisible by 100 is a leap year only if it is divisible by 400. Your program should accept the
month, day, and year as integers. Include a function leap that returns 1 if called with a leap year, 0
otherwise.*/

#include<stdio.h>
int main(int argc, char const *argv[])
{
    int day;
    char month[10];
    int year;

    printf("Enter the Day: ");
    scanf("%d", &day);

    printf("Enter the Month: ");
    scanf("%s", month);

    printf("Enter The Year: ");
    scanf("%d", &year);

    int totalDays;
    int isLeapYear = findLeapYear(year);

    if (strcmp(month, "January") == 0) {
        totalDays = day;
    } else if (strcmp(month, "February") == 0) {
        totalDays = day + 31;
    } else if (strcmp(month, "March") == 0) {
        totalDays = day + 59;
    } else if (strcmp(month, "April") == 0) {
        totalDays = day + 90;
    } else if (strcmp(month, "May") == 0) {
        totalDays = day + 120;
    } else if (strcmp(month, "June") == 0) {
        totalDays = day + 151;
    } else if (strcmp(month, "July") == 0) {
        totalDays = day + 181;
    } else if (strcmp(month, "August") == 0) {
        totalDays = day + 212;
    } else if (strcmp(month, "September") == 0) {
        totalDays = day + 243;
    } else if (strcmp(month, "October") == 0) {
        totalDays = day + 273;
    } else if (strcmp(month, "November") == 0) {
        totalDays = day + 304;
    } else if (strcmp(month, "December") == 0) {
        totalDays = day + 334;
    } else {
        printf("Month not recognized.\n");
        return 1;  // Exit the program with an error code
    }

    if (isLeapYear) {
        totalDays = totalDays + 1;
        printf("Total Days: %d\n", totalDays);
    } else {
        printf("Total Days: %d\n", totalDays);
    }

    return 0;
}

int findLeapYear(int year) {
    if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0))
        return 1;
    else
        return 0;
}