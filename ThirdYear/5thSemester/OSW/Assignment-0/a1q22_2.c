/*22. Write a program to read three characters from the standard input device (i.e. keyboard) and display
the characters on the standard output device (i.e. monitor) using %c format specifier/place holder.
The different ways to provide input to the program are; (i) S O A (ii) S ¡enter¿ O ¡enter¿ A ¡enter¿
(iii) ¡multiple spaces¿ S ¡multiple spaces¿ O ¡multiple spaces¿ A ¡enter¿. Redesign your program to
use %s in scanf for the same objective instead of %c in scanf.*/

int main() {
    char input[4];  // Considering 3 characters and a null terminator

    // Reading a string using %s format specifier
    printf("Enter three characters: ");
    scanf("%3s", input);  // Read at most 3 characters to avoid buffer overflow

    // Displaying the characters using %s format specifier
    printf("You entered: %s\n", input);

    return 0;
}