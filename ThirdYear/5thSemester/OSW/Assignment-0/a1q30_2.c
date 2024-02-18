/*30. A C program contains the following statements. Write an appropriate scanf function to enter numerical values of i, j and k assuming
(ii) The value of i will be decimal integer, j an octal integer and k a hexadecimal integer. Display
the values.*/

int main(){
    int i,j,k;
    scanf("%d%o%x",&i,&j,&k);
    printf("%d%o%x",i,j,k);
}