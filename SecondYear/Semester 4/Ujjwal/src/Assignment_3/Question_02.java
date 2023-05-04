//	Given an array containing 0s, 1s and 2s. Write an algorithms to sort array
//	so that 0s come first followed by 1s and then 2s in the end.

package Assignment_3;
public class Question_02 {
	public static void main(String[] args) {
		int[] arr = {0,1,0,0,1,1,2,1,1,0,1,2,1};
		int[] arr2 = swapZeroOneTwo(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] swapZeroOneTwo(int[] arr) {
		int counter=0;
		int i=0;
		return arr;
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
