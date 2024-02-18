/*WAP to read an array of n integers and find the max element, min element , sum of even array element and of the odd array elements.*/

int maxElement(int arr[] , int n);
int minElement(int arr[] , int n);
int sumEvenElement(int arr[] , int n);
int sumOddElement(int arr[] , int n);
#include<stdio.h>

int maxElement(int arr[] , int n){
	int max = -1;
	for(int i =0 ; i<n ; i++){
		if(max<i[arr]){
			max = arr[i];
		}
	}
	
	return max;
}

int minElement(int arr[] , int n){
	int min = arr[0];
	for(int i =0 ; i<n ; i++){
		if(min>arr[i]){
			min = arr[i];
		}
	}
	return min;
}

int sumEvenElement(int arr[] , int n){
	// Sum of Even Array Elements
	int sum = 0;
	for(int i=0 ; i<n ; i++){
		if(arr[i]%2==0){
			sum+=arr[i];
		}
	}return sum;
}

int sumEvenElement(int arr[] , int n){
	// Sum of Even Array Elements
	int sum = 0;
	for(int i=0 ; i<n ; i++){
		if(arr[i]%2!=0){
			sum+=arr[i];
		}
	}return sum;
}

int main(){
	int arr[10] = {1,2,12,43,12,43,12,43 , 95 , 10};
	int n = 10;
	int max;
	int min;
	int sumOdd;
	int sumEven;
	
	
	temp = maxElement(arr , n);
	printf("Maximum Element : %d",temp);
	
	min = minElement(arr , n);
	printf("Minimum  Element : %d",min);
	
	sumEven = sumEvenElement(arr , n);
	
	printf("Sum of Even  Elements : %d",sumEven);
	sumOdd = sumOddElement(arr , n);
	printf("Sum of Odd  Elements : %d",sumOdd);
}
