/*7. A baseball player’s batting average is calculated as the number of hits divided by the official number
of at-bats. In calculating official at-bats, walks, sacrifices, and occasions when hit by the pitch are
not counted. Write a program that takes an input file containing player numbers and batting records.
Trips to the plate are coded in the batting record as follows: H-hit, O-out, W-walk, S-sacrifice, P-hit
by pitch. The program should output for each player the input data followed by the batting average.
Each batting record is followed by a newline character. Your program should not use any kind of
array and array processing.
*/

#include<stdio.h>
int main(){
	printf("Calculating the Hits of a Batsman");
	int ip = 0;
	char c;
	
	while(ip!=-1){
		ip = scanf("%c",&c);
		char storeNum;
		int storeHit = 0;
		int totalBall = 0;
		char record[]="";
		while(c!='\n'){
			if(c<'A'){
				storeNum = c;
			}
			else{
				record = strcat(record,c);
			}
			if(c=='H' || c=='P'){
				storeHit++;
			}
			totalBall++;
		}	
		printf("Player %c's record : %d\n",storeNum,record);
		printf("Player %c's batting average : %f",storeNum,totalBall/storeHit);
	}
	return 0;
}
