/*The minimum field width and precision in the format string of printf function can be applied to character data as well as numerical data. When applied to a string, the minimum field width is interpreted
in the same manner as with the numerical quantity. However, the precision specification will determine the maximum number of characters that can be displayed. If the precision specification is
less than the total number of characters in the string, the excess right-most characters will not be
displayed. This will occur even if the minimum field width is larger than the entire string, resulting
in the addition of leading blanks to the truncated string. So, write the output of the following code
snippet*/

int main(){
    char line[] = "hexadecimal";
    printf(":%10s:  :%15s:  :%15.5s:    :%.5s:  \n",line,line,line);
    return 0;
}