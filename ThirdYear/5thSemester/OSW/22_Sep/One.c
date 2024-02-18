#include<stdio.h>
int main(){
	char name[15];
	int number;
	char address[20];
	char pincode[6];
	 
	printf("Enter Your Name \n");
	scanf("%[^\n]",name);
	
	printf("Enter Your Phone Number \n");
	scanf("%d",&number);
	
	printf("Enter Your Address \n" );
	scanf("%[ABCDEFGHIZKLMNOPQRSTUVWXYZ]",address);
	
	printf("Enter Your Pincode \n");
	scanf("%[82600123456789]",pincode);
	
	printf("Your Name is %s\n",name);
	printf("Your Phone Number is %d",number);
	printf("Your Address is %s\n ",address);
	printf("Your Pincode is %s\n",pincode);
	return 0;
}
