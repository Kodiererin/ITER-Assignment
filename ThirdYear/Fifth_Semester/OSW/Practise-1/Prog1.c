#include <stdio.h>
#include <stdlib.h>

int main() {
//    Starting With Pointers.
//  Creating a LinkedList
    int var = 10;
    int *ptr1 = &var;
    int **ptr0 = ptr1;
    printf("%p\n",*ptr0);
    printf("%p",ptr1);
}
