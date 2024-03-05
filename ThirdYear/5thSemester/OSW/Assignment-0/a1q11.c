/*The following C code snippet illustrate the use ∗ as minimum field width feature in printf function.
Write the output of the code snippet assuming as 1 blank space.*/

int main()
{
    int ivar = 1234;
    printf(":%*d:\n", 10, ivar);
    printf(":%-*d:\n", 10, ivar);
    return 0;
}