/* State the data types would you use to represent the following items: number of students in your
section, a letter grade on the AD1 exam, average number of days in a semester, the name of the topper
of your class, total number of courses in this semester. Also specify the format specifier/placeholder
for the variables used in the above case.*/

#include<stdio.h>
int main(){
	int students;
	char grade[1];
	int avgDays;
	int toppers;
	int courses;
	
	printf("Enter No Of Students\nGrade,Average Days\nNo of Toppers\nNo of Courses\n");
	scanf("%d %s %d %d %d",&students,grade,&avgDays,&toppers,&courses);
	
	printf("Student Details and Class Details \n%d\n%s\n%d\n%d\n%d",students,grade,avgDays,toppers,courses);
	return 0;
}
