/*18. Illustrate the purpose of the following code snippet over the inputs a,b and c respectively.
int m1,m2,a,b,c;
printf("Enter the values of a,b,c:");
scanf("%d%d%d",&a,&b,&c);
m1=(a>b)?a:b;
m2=(m1>c)?m1:c;
printf("%d\n",m2);*/

#include<stdio.h>
int main(){
	int m1,m2,a,b,c;
	printf("Enter the values of a,b,c:");
	scanf("%d%d%d",&a,&b,&c);
	m1=(a>b)?a:b;
	m2=(m1>c)?m1:c;
	printf("%d\n",m2);
	return 0;
}
