#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t child_pid;

    child_pid = fork();

    if (child_pid == -1) {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    } else if (child_pid == 0) {
        printf("Child %d\n", getpid());

        while (1) {
            // Do nothing
        }
    } else {
        // Parent process
        printf("Parent %d\n", getpid());

        // Parent continues in an indefinite loop
        while (1) {
            // Do nothing
        }
    }

    return 0;
}
