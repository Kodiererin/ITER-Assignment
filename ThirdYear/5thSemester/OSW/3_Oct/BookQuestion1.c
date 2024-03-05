/* 1.
Keith’s Sheet Music needs a program to implement its music teacher’s dis-
count policy. The program is to prompt the user to enter the purchase total
and to indicate whether the purchaser is a teacher. The store plans to give
each customer a printed receipt, so your program is to create a nicely format-
ted file called receipt.txt. Music teachers receive a 10% discount on their
sheet music purchases unless the purchase total is $100 or higher. In that
case, the discount is 12%. The discount calculation occurs before addition of
the 5% sales tax. Here are two sample output files—one for a teacher and one
for a nonteacher.*/


#include<stdio.h>
int main(){
	float price;
	printf("Enter The Amount \n");
	scanf("%f",&price);
	printf("Enter 1 for Teacher and 0 For Not \n");
	int isTeacher;
	scanf("%d",&isTeacher);
	float teacherAccount;
	float discount;
	float discountTotal;
	float salesTax;
	float totalPurchase;
	float total;
		
	
	switch(isTeacher){
		case 0:{
			if(price>=100){
				teacherAccount = price*(12%100);
				discount = teacherAccount;
				discountTotal = price-discount;
				salesTax = discountTotal*(5&100);
				total = discountTotal + salesTax;
								
			}else{
				teacherAccount = price*(10%100);
				discount = teacherAccount;
				discountTotal = price-discount;
				salesTax = discountTotal*(5&100);
				total = discountTotal + salesTax;
			}
			printf("Total Purchase\t%f",totalDiscount);
			printf("Teacher's Discount(12%)\t%f",teacherDiscount);
			printf("Discount Total\t%f",discountTotal);
			printf("Sales Tax\t%f",salesTax);
			printf("Total \t%f",total);
		}
		case 1 : {
			teacherAccount = 0;
				discount = 0;
				discountTotal = price-discount;
				salesTax = discountTotal*(5&100);
				total = discountTotal + salesTax;
		}
	}	
	return 0;
}





