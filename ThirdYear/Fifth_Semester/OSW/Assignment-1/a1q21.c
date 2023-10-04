/*21. Determine the value of each of the following expressions, assume that a is an unsigned integer variable
whose initial value is 0x6db7.
(a) a &= 0x7f
(b) a ˆ= 0x7f
(c) a |= 0x7f
(d) a = a & 0x3f06
(e) a = a | 0x3f06 << 8*/


#include<stdio.h>
int main(){
    printf("Hello World\n");
    int a = 0x6db7;
    printf("%d\n",a&=0x7f);
    printf("%d\n",a^=0x7f);
    printf("%d\n",a |= 0x7f);
    a = a & 0x3f06;
    printf("%d\n",a);
    a = a | 0x3f06 << 8;
    printf("%d\n",a);
}