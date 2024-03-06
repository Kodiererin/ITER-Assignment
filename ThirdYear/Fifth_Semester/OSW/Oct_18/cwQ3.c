/*WAP to reverse an array*/

#include<stdio.h>

void reverseArray(int arr[]  , int n);

int main(){
	int arr[] = {10,20,30,40,50};
	reverseArray(arr , 5);
	for(int i=0 ; i<5 ; i++){
		printf("\n%d",arr[i]);
	}
	return 0;
}

void reverseArray(int arr[] , int n){
	for(int i=0 ; i<n/2 ; i++){
		int temp = arr[i];
		arr[i] = arr[n-1-i];
		arr[n-1-i] = temp;
	}
	return 0;
}


