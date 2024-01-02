#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int isPotato(int veggie) {
    if (veggie <= 1) {
        return 0;
    }

    for (int i = 2; i * i <= veggie; i++) {
        if (veggie % i == 0) {
            return 0;
        }
    }

    return 1;
}

void growFries(int length, int *potatoes) {
    if (length >= 1) {
        potatoes[0] = 0;
    }
    if (length >= 2) {
        potatoes[1] = 1;
    }

    for (int i = 2; i < length; i++) {
        potatoes[i] = potatoes[i - 1] + potatoes[i - 2];
    }
}

int main() {
    int friesLength;

    printf("Enter the length of the Potato series: ");
    scanf("%d", &friesLength);

    int *potatoes = (int *)malloc(friesLength * sizeof(int));

    pid_t tomato = fork();

    if (tomato == -1) {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    } else if (tomato == 0) {
        growFries(friesLength, potatoes);
        for (int i = 0; i < friesLength; i++) {
            printf("%d ", potatoes[i]);
        }
        exit(EXIT_SUCCESS);
    } else {
        waitpid(tomato, NULL, 0);

        printf("\n");

        for (int i = 0; i < friesLength; i++) {
            if (isPotato(potatoes[i])) {
                printf("Prime Potato Number: %d at position %d\n", potatoes[i], i + 1);
                break;
            }
        }

        free(potatoes);
    }

    return 0;
}
