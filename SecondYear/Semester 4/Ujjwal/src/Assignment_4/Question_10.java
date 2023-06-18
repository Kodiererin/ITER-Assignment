package Assignment_4;
//Given an array of size N, the elements in the array may be repeated. You
//need to find sum of distinct elements of the array. If there is some value
//repeated continuously then they should be added once.
public class Question_10 {
	public static void main(String[] args) {
		int[] arr = {1,-2,-10,-1,-3,-2};
		compute(arr);
	}
	public static void compute(int[] arr) {
		int a;
		int b=a=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				if(arr[i]+arr[j]==0) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		System.out.println("The Pair such that their sum is closest to 0 is "+a+" "+b);
	}
}
