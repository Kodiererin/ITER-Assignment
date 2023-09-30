/*29. A C program contains the following form; Suppose that the following string has been assigned to text
Programming with C cab be a challenging creative activity. Show the output resulting from the following printf statements*/

int main(){
    char text[100] = "Programming with C cab be a challenging creative activity";
    printf("%s\n",text);
printf("%18s\n",text);
printf("%.18s\n",text);
printf("%18.7s\n",text);
printf("%-18.7s\n",text);
return 0;
}