package Assignment_3;
//	Given two array, sort first array according to the order defined in second
//	array	
public class Question_05 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,2,1,4,2,1,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		int[] arr3= sortFirstArray(arr1, arr2);
		
		for(int i=0 ; i<arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
		
	}
//	Assuming the Second Array is Sorted either ascending or descending
	public static int[] sortFirstArray(int[] arr1 , int[] arr2) {
		if(arr2[0]<arr2[1]) {
//			Ascending Order
			return sortAscendingOrder(arr1);
		}
		else {
			return sortDescendingOrder(arr1);
		}
	}
//	Ascending Order
	public static int[] sortAscendingOrder(int[] arr) {
//		Using Bubble Sort
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
		return arr;
	}
//	Descending Order
	public static int[] sortDescendingOrder(int[] arr) {
//		Using Bubble Sort
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				if(arr[i]<arr[j]) {
					swap(arr,i,j);
				}
			}
		}
		return arr;
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
