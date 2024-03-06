/*22. Write a program to read three characters from the standard input device (i.e. keyboard) and display
the characters on the standard output device (i.e. monitor) using %c format specifier/place holder.
The different ways to provide input to the program are; (i) S O A (ii) S ¡enter¿ O ¡enter¿ A ¡enter¿
(iii) ¡multiple spaces¿ S ¡multiple spaces¿ O ¡multiple spaces¿ A ¡enter¿. Redesign your program to
use %s in scanf for the same objective instead of %c in scanf.*/

int main() {
    char char1, char2, char3;

    // Reading characters using %c format specifier
    printf("Enter three characters: ");
    scanf("%c %c %c", &char1, &char2, &char3);

    // Displaying the characters using %c format specifier
    printf("You entered: %c %c %c\n", char1, char2, char3);

    return 0;
}