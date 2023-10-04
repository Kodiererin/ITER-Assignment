/*20. Predict the output of the given code snippet that outline the use of flags with string.
 */

int main()
{
    char line[] = "lower-case";
    printf(":%15s: :%15.5s: :%.5s:\n", line, line, line);
    printf(":%-15s: :%-15.5s: :%-.5s:\n", line, line, line);
    return 0;
}