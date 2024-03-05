// Read 4 Invidual Digit and Make a Whole No

#include<stdio.h>
int main(){
	int no = 0;
	int i=0;
	while(i<4){
		int data;
		scanf("%d",&data);
		if(data>9){
			printf("No cannot be greater than 9");
			return 0;
		}
			no+=data;
			i++;
		no*=10;
		
	}
	no = no/10;
	printf("%d",no);
	return 0;
}


