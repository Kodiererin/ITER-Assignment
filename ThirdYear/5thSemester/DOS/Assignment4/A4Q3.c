#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>

void copyFile(char *sourceFile, char *destinationFile) {
    FILE *source, *destination;
    char ch;

    source = fopen(sourceFile, "r");
    if (source == NULL) {
        perror("Error opening source file");
        exit(EXIT_FAILURE);
    }

    destination = fopen(destinationFile, "w");
    if (destination == NULL) {
        perror("Error opening destination file");
        fclose(source);
        exit(EXIT_FAILURE);
    }

    while ((ch = fgetc(source)) != EOF) {
        fputc(ch, destination);
    }

    printf("Child %d (Copy) completed successfully\n", getpid());

    fclose(source);
    fclose(destination);
}

void displayFile(char *filename) {
    FILE *file;
    char ch;

    file = fopen(filename, "r");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    printf("Child %d (Display) content:\n", getpid());

    while ((ch = fgetc(file)) != EOF) {
        putchar(ch);
    }

    printf("\n");

    fclose(file);
}

void displaySortedReverse(char *filename) {
    FILE *file;
    char line[100][100], temp[100];
    int i, j, count = 0;

    file = fopen(filename, "r");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    printf("Child %d (Sort & Reverse) content:\n", getpid());

    while (fgets(line[count], sizeof(line[count]), file)) {
        count++;
    }

    for (i = 0; i < count - 1; i++) {
        for (j = i + 1; j < count; j++) {
            if (strcmp(line[i], line[j]) < 0) {
                strcpy(temp, line[i]);
                strcpy(line[i], line[j]);
                strcpy(line[j], temp);
            }
        }
    }

    for (i = 0; i < count; i++) {
        printf("%s", line[i]);
    }

    printf("\n");

    fclose(file);
}

int main() {
    pid_t child1, child2, child3;

    printf("Parent process id: %d\n", getpid());

    child1 = fork();
    if (child1 == 0) {
        printf("Child 1 id: %d, Parent id: %d\n", getpid(), getppid());
        copyFile("file1.txt", "file2.txt");
        exit(EXIT_SUCCESS);
    } else {
        sleep(1);
    }

    child2 = fork();
    if (child2 == 0) {
        printf("Child 2 id: %d, Parent id: %d\n", getpid(), getppid());
        displayFile("file2.txt");
        exit(EXIT_SUCCESS);
    } else {
        sleep(1);
    }

    child3 = fork();
    if (child3 == 0) {
        printf("Child 3 id: %d, Parent id: %d\n", getpid(), getppid());
        displaySortedReverse("file2.txt");
        exit(EXIT_SUCCESS);
    } else {
        sleep(1);
    }

    // Parent process
    waitpid(child1, NULL, 0);
    waitpid(child2, NULL, 0);
    waitpid(child3, NULL, 0);

    printf("Parent process completed\n");

    return 0;
}
