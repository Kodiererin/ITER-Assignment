/*4. An integer n is divisible by 9 if the sum of its digits is divisible by 9. Develop a program to display
each digit, starting with the rightmost digit. Your program should also determine whether or not the
number is divisible by 9. Test it on the following numbers:
n = 154368
n = 621594
n = 123456
Hint: Use the % operator to get each digit; then use / to remove that digit. So 154368 % 10 gives 8
and 154368 / 10 gives 15436. The next digit extracted should be 6, then 3 and so on.*/

#include<stdio.h>
int main(){
	int num;
	printf("Enter the Number That you want to check \n");
	scanf("%d",&num);
	int sum=0;
	while(num>0){
		sum+=num%10;
		num = num/10;
	}
	if(sum%9==0){
		printf("Number is Divisible by 9 and the sum is %d\n",sum);
		return 0;
	}else{
		printf("Not Divisible By 9");
	}
	
	return 0;
}
