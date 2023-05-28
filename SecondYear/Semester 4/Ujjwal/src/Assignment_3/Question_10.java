package Assignment_3;

import java.util.Arrays;

public class Question_10 {
	public static void main(String[] args) {
		int[] arr = {1,32,12,34,56,76,88,9,23,12,5,33};
		Arrays.sort(arr);
		findMin(arr);
		findMax(arr);
		findMedian(arr);
	}
	public static void findMin(int[] arr) {
		System.out.println(arr[0]);
	}
	public static void findMax(int[] arr) {
		System.out.println(arr[arr.length-1]);
	}
	public static void findMedian(int[] arr) {
		System.out.println(arr[(arr.length-1)/2]);
	}
}
