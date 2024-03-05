/*2. Write C statements to carry out the following.
If item is nonzero, then multiply product by item
and save the result in product ; otherwise, skip
the multiplication. In either case, print the value
of product. Declare the appropriate type and initialize, if required.*/

#include<stdio.h>
int main(){
    printf("Enter The Items and Products");
    int item;
    int product;
    scanf("%d%d",&item,&product);
    product = item>0?item*product:product;
    printf("%d",product);
    return 0;
}