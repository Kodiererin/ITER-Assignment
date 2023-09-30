/*19. Predict the output of the given code snippet that uses the flags with unsigned decimal, octal and
hexadecimal numbers*/

int main()
{
    int i = 345, j = 01767, k = 0xa0bd;
    printf(":%8u: :%8o: :%8x:\n", i, j, k);
    printf(":%-8u: :%-8o: :%-8x:\n", i, j, k);
    printf(":%#8u: :%#8o: :%#8x:\n", i, j, k);
    printf(":%08u: :%0o0: :%08x:\n", i, j, k);
    printf(":% #8u: :% #8o: :% #8x:\n", i, j, k);
    return 0;
}
