#include <stdio.h>

#define SIZE 3

void playGame(int, int);
void printStatus(int arr[SIZE][SIZE]);

int main() {
    printf("Hello to the Game\n");
    char p1[1];
    char p2[1];
    printf("Player 1, select your sword X or 0: ");
    scanf(" %c", &p1[0]);
    printf("Player 2, select your sword X or 0: ");
    scanf(" %c", &p2[0]);
    printf("Starting the Game\n");

    // Call playGame with player choices
    playGame(p1[0], p2[0]);

    return 0;
}

void playGame(int a, int b) {
    int game[SIZE][SIZE];
    int gameStatus = 1;

    while (!gameStatus) {
        // Your game logic goes here
    }
}

void printStatus(int arr[SIZE][SIZE]) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            printf("%d", arr[i][j]);
        }
        printf("\n");
    }
}
