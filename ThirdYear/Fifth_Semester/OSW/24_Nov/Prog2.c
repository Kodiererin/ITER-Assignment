// Demo of typedef:
#include<stdio.h>

typedef struct SData {int x ; float y;} UjjwalData;

int main(){
	struct SData x = {10,20.1};
	printf("%d %f\n",x.x , x.y);
	
	UjjwalData y = {99,99.999};
	printf("%d %f",y.x,y.y);
	
	return 0;
}
