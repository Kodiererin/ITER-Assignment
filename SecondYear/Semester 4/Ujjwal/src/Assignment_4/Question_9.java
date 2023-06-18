package Assignment_4;

//Given an array of size N, the elements in the array may be repeated. You
//need to find sum of distinct elements of the array. If there is some value
//repeated continuously then they should be added once

public class Question_9 {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,5,5,5,5,5,5};
		distinctSum(arr);
	}
	public static void distinctSum(int[] arr) {
		int prev = arr[0];
		int sum = arr[0];
		for(int i=1 ; i<arr.length ; ) {
			if(prev!=arr[i]) {
				sum = sum+arr[i];
				prev = arr[i];
				i++;
			}else {
				i++;
			}
		}
		System.out.println(sum);
	}
}
