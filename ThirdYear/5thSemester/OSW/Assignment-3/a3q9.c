#include <stdio.h>

int main() {
    for (int i = 0; i < 7; i++) {
        for (int l = 0; l < 7 - i; l++) {
            char c = 'A' + l;
            printf("%c ", c);
        }
        for (int s = 0; s < 4 * i; s++) {
            printf(" ");
        }
        for (int j = 6 - i; j >= 0; j--) {
            int e = 65 + j;
            char d = (char) e;
            printf("%c ", d);
        }
        printf("\n");
    }
    return 0;
}
