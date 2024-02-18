/*20. Suppose a is an unsigned integer variable (say represented in 16 bits format) whose value is 0x6db7.
In the following the expression, we will shift all bits of a six places to the right and assign the resulting
bit pattern to the unsigned integer variable b. Find the resulting value of b. Also write the lost bits
because of shifting.
b = a >> 6 ;*/

#include<stdio.h>
int main(){
    printf("Hello World\n");
    int a = 0x6db7;
    printf("%d",a>>6);
}