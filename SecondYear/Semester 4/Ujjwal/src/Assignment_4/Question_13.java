package Assignment_4;
//	Given an array of integers, find the element pair with minimum difference.
public class Question_13 {
	public static void main(String[] args) {
//		Assuming That it it is a Pair
		int[] arr = {1,2,3,2,4,5,7,5,3,5,7,8,0,-1};
		compute(arr);
	}
	public static void compute(int[] arr) {
		int min=Integer.MAX_VALUE;
		int a;
		int b;
		a = b = 0;
		for(int i=0 ; i<arr.length-1 ; i++) {
			if((arr[i]+arr[i+1])<min) {
				a = arr[i];
				b = arr[i+1];
				min = a+b;
			}
		}
		System.out.println(a+" "+b);
	}
}
