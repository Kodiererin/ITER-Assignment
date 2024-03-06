/*
	10. In a particular jurisdiction, taxi fares consist of a base fare of $4.00, plus $0.25 for every 140 meters
traveled. Write a function that takes the distance traveled (in kilometers) as its only parameter and
returns the total fare as its only result. Write a main program that demonstrates the function.
Hint: Taxi fares change over time. Use constants to represent the base fare and the variable portion
of the fare so that the program can be updated easily when the rates increase.
*/

#include<stdio.h>
#define cost 4.00;

float totalFare(float);


float totalFare(float distKM){
	float Cost = cost;
	float distM;
	int total;
	distM = distKM*1000;
	distM/=140;
	total = Cost + (0.25*distM);
	return (total);
}

int main(){
	float distKM;
	float tCost;
	printf("Enter the Distance in KM\t");
	scanf("%f",&distKM);
	tCost = totalFare(distKM);
	printf("%f",tCost);
}
