package April_26;

public class c_MedianOfArray {
	public static void main(String[] args) {
		
	}
	public static int findMedian(int[] arr) {
		java.util.Arrays.sort(arr);
		return(arr[Math.floor(arr[(arr.length)/2])]);
	}
}
