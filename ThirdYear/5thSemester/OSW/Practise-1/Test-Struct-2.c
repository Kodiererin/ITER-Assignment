#include <stdio.h>
#include <stdlib.h>

int main() {
    char c[] = "Hello-Ujjwal-Kumar,-Your-id-is-whoisujjwal";
    char delim[] = "-";
    int i = 0;

    // Counting the number of tokens.
    if (strtok_r(c, delim, &c) != NULL) {
        i = i + 1;
        while (strtok_r(NULL, delim, &c) != NULL) {
            i = i + 1;
        }
        printf("%d", i);
    }

    return 0;
}
