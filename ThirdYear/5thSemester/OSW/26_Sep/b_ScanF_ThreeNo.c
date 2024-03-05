// Write a Programm read three Numbers and Print the Three Numbers.
// Test Case : 
// 	Exact Format From Keyboard.
// 1. 10 20 30
// 2. 12345 40 60
// 3. 10
    //20
    //30
// 4. ***** Do Modify Scanf to seperate the 1 Input 123456 as
//	123 45 6
		
#include<stdio.h>
int main(){
 
 	int a,b,c;
 	printf("Enter Three Numbers \n");
 	scanf("%3d%2d%d",&a,&b,&c);
 	
 	printf("\nThe three Numbers are %d , %d , %d",a,b,c);
 	return 0;
 }
