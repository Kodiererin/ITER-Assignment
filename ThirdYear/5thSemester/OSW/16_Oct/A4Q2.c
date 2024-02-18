/*2. During execution of the following program segment, how many lines of star marks will be displayed?
Output
void nonsense(void){
printf("*****\n");
printf("* *\n");
printf("*****\n");
}
int main(void){
nonsense();
nonsense();
nonsense();
return (0);
}*/

#include<stdio.h>
void nonsense(void);
void nonsense(void){
	printf("*****\n");
	printf("* *\n");
	printf("*****\n");
}
int main(void){
	nonsense();
	nonsense();
	nonsense();
return (0);
}
