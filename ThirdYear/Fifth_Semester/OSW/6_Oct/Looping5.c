// WAP to read as many nos from the keyboard to find the sum of the numbers 
// Centenal Element

#include<stdio.h>
int main(){
	printf("Enter -1 to Stop the Marks Entry\n");
	int marks=0;
	int totalMarks = 0;
	int loop;
	while(loop){
		int marks;
		int d;
		scanf("%d",&d);
		marks = d;
		if(marks<=-1){
			printf("Invalid Marks");
			loop=0;
		}
		printf("Marks Entered = \t",marks);
		totalMarks+=marks;
	}
	printf("Total Marks = \t");
	printf("%d",totalMarks);
	return 0;
}
