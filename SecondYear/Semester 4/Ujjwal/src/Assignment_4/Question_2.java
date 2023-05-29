package Assignment_4;
//	Q2. Given an array of n numbers, print the duplicate elements in the array
import java.util.Arrays;
public class Question_2 {
		public static void main(String[] args) {
			System.out.println("Hello World");
			int[] arr = new int[20];
			int max = 100;
			int min = 0;
			for (int i = 0; i < arr.length; i++) {
			    arr[i] = (int) (Math.random() * (max - min + 1) + min);
			}
			compute(arr);
		}
//		Using Binary Search
//		1 2 3 2 3 4 7
		public static void compute(int[] arr) {
			Arrays.sort(arr);
			for(int i=0 ; i<arr.length-1 ; i++) {
				if(arr[i]==arr[i+1]) {
					System.out.println("Element Found "+arr[i]);
				}
			}
		}
}
