/*2. 3. During execution of the following program segment:
a. How many times does the first call to printf execute?
b. How many times does the second call to printf execute?
c. What is the last value displayed?*/

#include<stdio.h>
int main(){
int m , n;
int ctr=0;
int ctr1=0;
	for (m = 10; m > 0; --m){
		for (n = m; n > 1; --n)
		{
			printf("%d ", m + n);
			ctr++;
		}
		printf("\n");
		ctr1++;
	}
	printf("%d\t %d",ctr,ctr1);
	return 0;
}
