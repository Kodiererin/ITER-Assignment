package Assignment_4;

public class Question_14 {
//	Given two array, find minimum difference pair such that it should take
//	one element from each array.
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,-1,2,-3,-4};
		int[] arr2 = {-2,-3,2,1,-10,2,3};
		compute(arr1, arr2);
	}
	public static void compute(int[] arr , int[] brr) {
		int min = Integer.MAX_VALUE;
		int a;int b;
		a = b = 0;
		for(int i=0 ; i<arr.length ; i++	) {
			for(int j=0 ; j<brr.length ; j++) {
				if((arr[i]+brr[j])<min) {
					a = arr[i];
					b = brr[j];
					min = a+b;
				}
			}
		}
		System.out.println(a+" "+b);
	}
}
