package Assignment_3;

import java.util.Arrays;
import java.util.Collections;

//	Q5. Given two array, sort first array according to the order defined in second
//	array
public class Question_5 {
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1,0,0,0,1,0,1,0,1};
		int[] arr2 = {1,2,3,4,5,6,7,8};
		int[] arr3 = compute(arr , arr2);
		for(int i=0 ; i<arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
	}
	public static int[] compute(int[] arr1 , int[] arr2) {
		int i = arr2[0]<arr2[1]?+1:-1;
		if(i==1) {
			Arrays.sort(arr1);
		}else {
			Arrays.sort(arr1);
			int[] arr3 = new int[arr1.length];
			for(int i1=0 ; i1<arr1.length ; i1++	) {
				arr3[i1] = arr1[arr1.length-1-i1];
			}
			return arr3;
		}
		return arr1;
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
