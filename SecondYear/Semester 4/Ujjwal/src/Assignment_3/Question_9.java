package Assignment_3;

import java.util.Arrays;

//	Check the code, it is incomplete
//	Q9. Given two unsorted arrays, find union and intersection of these two
public class Question_9{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {1,2,5,8,19,25};
		compute(arr1, arr2);
	}
	public static void compute(int[] arr1 , int[] arr2) {
		Arrays.sort(arr1); Arrays.sort(arr2);		// logn + logn
		int min = arr1.length>arr2.length?arr2.length:arr1.length;
		int[] union = new int[arr1.length + arr2.length];
		int[] intersection = new int[min];
		int u=0;
		int inter = 0;
	
		int i=0;
		int j=0;
		for( ; i<arr1.length && j<arr2.length; ) {
			if(arr1[i]==arr2[j]) {
				intersection[inter] = arr1[i];
				union[u] = arr1[i];
				u++;
				inter++;
				i++;
				j++;
			}else if(arr1[i]<arr2[j]) {
				while(i<arr1.length&&arr1[i]<arr2[j]) {
					i++;
					union[u] = arr1[i];
					u++;
				}
			}else {
				while(j<arr2.length&&arr2[j]<arr1[i] ) {
					j++;
					union[u] = arr2[j];
					u++;
				}
			}
		}
		
		for(i=0 ; i<intersection.length ; i++	) {
			System.out.println(intersection[i]);
		}
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}