package Assignment__3;
//	 Given an array of even and odd numbers, write a program to separate
//   even numbers from the odd numbers.
public class Question_06 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = swapOddEven(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] swapOddEven(int[] arr) {
		
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
