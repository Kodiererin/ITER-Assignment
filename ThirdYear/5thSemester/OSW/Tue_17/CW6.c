/*WAP to Read charactesrs of String during compile time and Print the Array*/

#include<stdio.h>
int main(){
	char str[] = {'I','T','E','R','\0'};
	// Initialized the character arrray.
	// Be default in the charArray which is made as String.
	// At the end of the String Array a null value is automatically assigned.
	int i=0;
	for(i=0 ; str[i]!='\0' ; i++){
		printf("%c",str[i]);
	}	
	printf("\n");
	// We can also go with another way.
	char str1[] = "Hello world";
	for(i=0 ; str1[i]!='\0' ; i++){
		printf("%c",str1[i]);
	}
}


