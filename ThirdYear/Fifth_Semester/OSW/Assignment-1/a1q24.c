/*24. Predict the output of the given code snippet that illustrates a form of formatted input function scanf.
 */

int main()
{
    int sr = 100, pr = 100;
    sr = scanf("Me a scanner");
    pr = printf("scanf returns=%d\n", sr);
    printf("printf returns::%d\n", pr);
    return 0;
}


/*:

sr = scanf("Me a scanner");: The scanf function is called with the string "Me a scanner" as the format string. However, scanf expects format specifiers like %d, %s, etc., to match and read data. In this case, "Me a scanner" does not contain any format specifiers, so scanf won't read any input and will return 0 (indicating the number of successfully matched and assigned input items).

pr = printf("scanf returns=%d\n", sr);: The printf function is called to print the value of sr using %d format specifier. Since scanf returned 0 (no successful input matches), the output will be "scanf returns=0".

printf("printf returns::%d\n", pr);: The printf function is called to print the value of pr using %d format specifier. pr was set to the return value of printf (which is the number of characters printed), so it will print the number of characters in the string "scanf returns=0", which is 15.*/