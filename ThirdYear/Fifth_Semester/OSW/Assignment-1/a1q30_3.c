/*30. A C program contains the following statements. Write an appropriate scanf function to enter numerical values of i, j and k assuming
(iii) The value of i and j will be hexadecimal number and k an octal integer. Display the values*/

#include<stdio.h>

int main(){
    int i,j,k;
    scanf("%x%d%o",&i,&j,&k);
    printf("%x%x%o",i,j,k);
    return 0;
}