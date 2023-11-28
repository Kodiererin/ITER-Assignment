/*Here I will experiment with pointer of Pointers*/

#include<stdlib.h>
#include<stdio.h>

// I want that a pointer points to an array of pointers where each array element stores a String.
// and A String is a Array of characters

#include<stdlib.h>
#include<stdio.h>

int main() {
    // Why we have to typecast to (char ** ) as the malloc is returning the address of the character pointer array. 
    // This is the doubt 
    char **arrayPointer = (char **)malloc(10 * sizeof(char *));

    
    for (int i = 0; i < 10; i++) {
        arrayPointer[i] = (char *)malloc(10 * sizeof(char));
    }

    // Getting Data of First Names and Storing in the arrayPointer
    for (int i = 0; i < 10; i++) {
        printf("Enter the Name:\n");
        scanf("%s", arrayPointer[i]);
    }

    // Displaying the Values
    for (int i = 0; i < 10; i++) {
        printf("%s\n", arrayPointer[i]);
    }

    // Free allocated memory
    for (int i = 0; i < 10; i++) {
        free(arrayPointer[i]);
    }
    free(arrayPointer);

    return 0;
}
