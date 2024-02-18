/*6. Implement the following decision table using a nested if statement. Assume that the grade point
average is within the range 0.0 through 4.0.*/

#include<stdio.h>
int main(){
    float grade;
    printf("Enter The Grade \n");
    scanf("%f",&grade);
    if(grade>0.00 && grade<0.1)
        printf("Failed semesterregistration suspended");
    else if(grade>=1.0 && grade<=1.99)
        printf("On probation for next semester");
    else if(grade>=2.0 && grade<=2.99)
        printf("");
    else if(grade>=3.0 && grade<=3.49)
        printf("Deans List for Semester");
    else if(grade>=3.5 && grade<=4.0)
        printf("Highest Honors For semester");
    else
        printf("Marks Out Of Range");
    return 0;
}