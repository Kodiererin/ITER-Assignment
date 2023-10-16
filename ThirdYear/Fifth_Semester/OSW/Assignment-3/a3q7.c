/*7. A baseball player’s batting average is calculated as the number of hits divided by the official number
of at-bats. In calculating official at-bats, walks, sacrifices, and occasions when hit by the pitch are
not counted. Write a program that takes an input file containing player numbers and batting records.
Trips to the plate are coded in the batting record as follows: H-hit, O-out, W-walk, S-sacrifice, P-hit
by pitch. The program should output for each player the input data followed by the batting average.
Each batting record is followed by a newline character. Your program should not use any kind of
array and array processing.
*/

#include <stdio.h>

int main() {
    int playerNo, atBats, hits;
    while(scanf("%d", &playerNo) == 1) {
        char record;
        atBats = 0;
        hits = 0;

        printf("Player %d: ", playerNo);
        while (scanf(" %c", &record) == 1 && record != '\n') {
            if (record == 'H' || record == 'O' || record == 'W' || record == 'S' || record == 'P') {
                atBats++;
            }

            if (record == 'H') {
                hits++;
            }
        }


        double battingAverage = (double)hits / atBats;
        printf("Batting Records: ");
        rewind(stdin); 
        while (scanf(" %c", &record) == 1 && record != '\n') {
            printf("%c ", record);
        }
        printf("| Batting Average: %.3f\n", battingAverage);
    }

    return 0;
}
