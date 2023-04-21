package Assignment_1;
//	Write a recursive function to search an element using binary search.
//	Analyze its time complexity.
public class Question17 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		binarySearch(arr, 0, arr.length-1, 3);
	}
	public static void binarySearch(int [] arr , int i , int j , int search) {
		int mid = (i+j)/2;
		if(arr[mid]==search) {
			System.out.println("Element Found");
		}
		else {
			if(search<arr[mid])
				binarySearch(arr, i, mid, search);
			else
				binarySearch(arr, mid+1, j, search);
		}
	}
}
