/* Assuming the side, and area are type float variables containing the length of one side in cm
and area of a square in square cm, write a statement using printf that will display this information in
this form:
The area of a square whose side length is ________________ cm
is ________________ square cm. */

#include<stdio.h>
int main(){
	int side;
	float area;
	printf("Enter The Length of the  Side of a Square\n");
	scanf("%d",&side);
	area = side*side;
	printf("The Area of the Square is \n %f ",area);
	return 0;
}
