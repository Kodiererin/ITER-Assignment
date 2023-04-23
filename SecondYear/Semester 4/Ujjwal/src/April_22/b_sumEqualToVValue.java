package April_22;
//	Given an array of n nummbers find a pair such that whose sum is equal to a given value.
public class b_sumEqualToVValue {
	public static void main(String[] args) {
		int[] arr = {1,2,5,6,7};						// value is 0
		int value=9;
		findSum(arr, value);
	}
	public static void findSum(int[] arr , int value) {
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		boolean flag = false;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				int temp = arr[i]+arr[j];
				if(temp==value) {
					a = arr[i];
					b = arr[j];
					flag = true;
					System.out.println(arr[i]+" + "+arr[j]+" = "+temp);
					break;
				}
			}
		}
		if(flag == false) {
			System.out.println("The Pair Not Found");
		}
	}
}
