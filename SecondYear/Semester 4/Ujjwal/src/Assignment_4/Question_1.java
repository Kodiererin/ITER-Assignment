package Assignment_4;

import java.util.Arrays;
//	Q1. Given an unsorted list of n elements, find the first element, which is repeated.
public class Question_1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {2,12,34,7,12};
		compute(arr);
	}
//	Using Binary Search
//	1 2 3 2 3 4 7
	public static void compute(int[] arr) {
		Arrays.sort(arr);
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Element Found "+arr[i]); break;
			}
		}
	}
}
