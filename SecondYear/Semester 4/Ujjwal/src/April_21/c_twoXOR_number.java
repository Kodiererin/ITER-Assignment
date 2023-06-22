package April_21;
//	Given an array in which all elements are appear even number of times except two number which appear odd number of time.
//	Find the elements which is present odd number of time.
//	-------------------- USE XOR ---------------------------------
//	------------ 	INCOMPLETE CODE ------------------------------
//	----------------- REWRITE ----------------------------------

import java.util.Arrays;

public class c_twoXOR_number {
	public static void main(String[] args) {
		int[] arr = {2,3,4,4,4,4,5,5,5,2,4,3,4,5};
//		int[] arr = {2,2,2,5,5,5};
		find2Xor(arr);
	}
	public static void find2Xor(int[] arr) {
		Arrays.sort(arr);
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum = sum^arr[i];
		} 
		int maskBit = sum&(~(sum-1));
		
//		Proceed From Here
		int s1 = 0;
		int s2 = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			if((arr[i]&maskBit)==0) {
				s1 = arr[i];
			}
			else {
				s2 = s2^arr[i];
			}
		}
		System.out.println(s1);
//		System.out.println(s2);
	}
	public static void display(int[] arr ) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
