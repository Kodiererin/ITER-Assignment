/*
	WAP to search an element in an array and display its poition using linear search.
*/


#include<stdio.h>
int linearSearch(int arr[] , int n , int element);
int binarySearch(int[] , int start , int end , int element);


int main(){
	int n = 10;
	int arr[n];
	int i=0;
	while(i<n){
		printf("Enter the Number \n");
		scanf("%d",&arr[i]);
		i++;
	}
	printf("\nEnter The Element You Want to Search : \n");
	int element;
	scanf("%d",&element);
	int getIndex;
	getIndex = linearSearch(arr , n , element);
	
	if(getIndex==-1){
		printf("Element Not Found \n");
	}else{
		printf("Element Found at index %d",getIndex);
	}
	
	
	printf("\nSearching Using Binary Search ");
	int getElement;
	getElement= binarySearch(arr , 0 , n , element);
	if(getElement == -1){
		printf("\nElement Not Found \n");
	}else{
		printf("\nData Found Using Binary Search at Index = %d",getElement);
	} 
	
	return 0;
}

/*Function : Linear Search */
int linearSearch(int arr[] , int n , int element){
	int ctr=0;
	for(int i=0 ; i<n ; i++){
		if(arr[i]==element){
			return i;
		}
	}
	return -1;
}

/*Searching Using Binary Search */
int binarySearch(int arr[] , int start , int end , int element){
	if(start==end){
		if(arr[start]==element){
			return start;
		}else{
			return -1;
		}
	}
	int mid = (start+end)/2;
	if(element==arr[mid]){
		return mid;
	}
	else if(element<arr[mid]){
		binarySearch(arr,start,mid, element);
	}else{ 
		binarySearch(arr , mid+1 , end , element);
	}
}
