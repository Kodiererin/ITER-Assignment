/*6. Write a program to process a collection of the speeds of vehicles. Your program should count and
print the number of vehicles moving at a high speed (90 miles/hour or higher), the number of vehicles
moving at a medium speed (50-89 miles/hour), and the number of vehicles moving at a slow speed
(less than 50 miles/hour). It should also display the category of each vehicle. Test your program on
the following data in a file:
43 23 54 57 68 67 51 90 33 22 11 88 34 52 75 12 78 32 89 14 65 67 97
53 10 47 34
a. Also code to display the average speed of a category of vehicle (a real number) at the end of the
run.
b. Store the data into a file vspeed.txt. Use input redirection to read all numbers from that file.
(i.e. ./a.out < vspeed.txt)
c. While reading the input from the file, apply the idea of scanf function returns. The scanf
returns: (1) On success, this function returns the number of input items successfully matched and assigned (ii) The
value EOF is returned if the end of input is reached before either the first successful conversion or a matching
failure occurs.*/

/*5. The greatest common divisor (gcd) of two integers is the product of the integers common factors.
Write a program that inputs two numbers and implements the following approach to finding their gcd.
We will use the numbers −252 and 735. Working with the numbers’ absolute values, we find the
remainder of one divide by the other.*/

#include<stdio.h>
int main(){
	int speed;
	int cat1=0;	// 90 miles
	int avgcat1=0;
	int cat2=0;	// 50-89 miles
	int avgcat2=0;
	int cat3=0;	// <50	miles
	int avgcat3=0;
	int scanfCheck = 0;
	int ctr=0;

	
	while(ctr!=27){
		scanfCheck = scanf("%d",&speed);
		//printf("%d",scanfCheck);
		if(speed>90){
			avgcat1+=speed;
			cat1++;
		}else if(speed<90 && speed>=50){
			avgcat2+=speed;
			cat2++;
		}else if(speed<=50){
			avgcat3+=speed;
			cat3++;
		}
		ctr++;
	}
	
	// a. average Speed of each categories
	printf("\n Greater Than 90 is %d vehicles whose average speed is  %d \n",cat1,avgcat1);
	printf("Greater Than 50 and less than 89 is %d vehicles whose average speed is  %d \n",cat2,avgcat2);
	printf("Less than 90 is %d vehicles whose average speed is %d   \n",cat3,avgcat3);
	
	
	// b. Store the Data in the Text File
	
	
	// c. 
	return 0;
}



