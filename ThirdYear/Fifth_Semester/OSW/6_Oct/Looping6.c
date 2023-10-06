 //15. The value for  can be determined by the series equation

#include<stdio.h>
int main(){
	float ctr=1;
	int i=0;
	float sum=0;
	while(ctr<10000){
		if(i%2==0){sum+=(1/ctr);}
		else{sum-=(1/ctr);}
		ctr+=2;
		i++;
	}
	sum*=4;
	printf("%.3f",sum);
	return 0;
}
