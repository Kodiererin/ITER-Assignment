#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void removeDup(char*, char*);

int main(){
    char c[20];
    printf("Enter a string: ");
    scanf("%s", c);
    printf("Original String: %s\n", c);
    
    char s[20]; // Changed the data type to an array
    removeDup(c, s);
    
    printf("String after removing adjacent duplicates: %s\n", s);
    return 0;
}

void removeDup(char* f, char* to){
    int len = strlen(f);
    
    if (len <= 1) {
        strcpy(to, f);
        return;
    }
    
    int j = 0;
    int i;
    for (i = 0; i < len - 1; i++) {
        if (f[i] != f[i + 1]) {
            to[j++] = f[i];
        }
    }
    
    to[j++] = f[i]; // Adding the last character
    
    to[j] = '\0'; // Null-terminate the string
}
