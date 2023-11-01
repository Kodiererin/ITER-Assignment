/* 12. Write a program that allows the user to convert a number from one base to another. Your program
 should support bases between 2 and 16 for both the input number and the result number. If the user
 chooses a base outside of this range then an appropriate error message should be displayed and the
 program should exit. Divide your program into several functions, including a function that converts
 from an arbitrary base to base 10, a function that converts from base 10 to an arbitrary base, and a
 main program that reads the bases and input number from the user.*/

#include<stdio.h>
#include<math.h>

int baseTobase10(int , int);

int base10ToarbBase(int);

int baseTobase10(int num , int base){
    return log10(num)/log10(base);
}

int base10ToarbBase(int num , int base){
    return log10(num)/log10(base);
}

int main(){
    int data = baseTobase10(100,2);
    printf(base10ToarbBase(data,10));
    return 0;
}