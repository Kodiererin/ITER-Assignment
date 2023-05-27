package Assignment__3;
//	 Write a program to find minimum swaps required to bring all elements
//	less than given value together at the start of array


public class Question_04 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,5,6,8,10};
		int value = 5;
		minimumSwaps(arr, value);
	}
	public static void minimumSwaps(int[] arr , int value) {
		int start = 0;
		int counter = 0;
		
		int swaps = 0;
		while(counter<arr.length) {
			if(arr[counter]<value) {
				swap(arr,start,counter);
				start++;
				swaps++;
			}
			counter++;
		}
		System.out.println("Minimum Swaps Required = "+swaps);
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
