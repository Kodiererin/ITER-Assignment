package Assignment_1;



//	Q9. Given an unsorted array, find the smallest positive number missing in
//	the array.
public class Question09 {
	public static void main(String[] args) {
		int[] arr = {1,2,4,33,1,0};
		findSmallest(arr);
	}
	public static void findSmallest(int[] arr) {
		java.util.Arrays.sort(arr);
		int i=0;
		while(i<arr.length) {
			if(arr[i]==arr[i+1]) {
				i++;
			}
			if(arr[i]-1>=0) {
				System.out.println("The Smallest Positive Element is "+(arr[i]-1));
				break;
			}
			if(arr[i+1]!=arr[i]+1) {
				System.out.println("The Smallest Positive Element is "+(arr[i]+1));
				break;
			}
			i++;
		}
	}
}
