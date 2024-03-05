/*8. The following expressions contain different operands and operators assuming x=3.0 , y=4.0 , and
z=2.0 are type double , flag=0 is type int. Write each expressions value.*/

#include<stdio.h>
int main(){
	double x=3.0;
	double y = 4.0;
	double z = 2.0;
	int flag = 0;
	
	printf("%d\n",!flag);
	printf("%d\n",((x+y/z)<=3.5));
	printf("%d\n",(!flag||(y+z >= x-z)));
	printf("%d\n",!(flag || (y+z)>=(x-z)));
	return 0;
}
