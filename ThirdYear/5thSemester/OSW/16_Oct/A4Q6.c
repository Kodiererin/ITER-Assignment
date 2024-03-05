/*6. The output of executing the following C program is*/

#include<stdio.h>
int main(){
	int x = 0;
	int i=5;
	for(;i>0 ; i--){
		x = x+total(i);
	}	
	printf("%d\n",x);
	return 0;
}

int total(int v){
	int count = 0;
	while(v){
		count +=v&1;
		v>>=1;
	}
	return count;
}

