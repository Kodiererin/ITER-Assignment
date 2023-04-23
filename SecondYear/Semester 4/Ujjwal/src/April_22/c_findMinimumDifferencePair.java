package April_22;
//	Given two array integer. Find minimum difference pair such that one element from one array and second
//	element from another array.
public class c_findMinimumDifferencePair {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,3,2,5};
		compute(arr1, arr2);
	}
	public static void compute(int[] arr1, int[] arr2) {
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		boolean flag = false;
		for(int i=0 ; i<arr1.length ; i++) {
			for(int j=0 ; j<arr2.length ; j++) {
				int temp = Math.abs(arr1[i])-Math.abs(arr2[j]);
				if(temp==0) {
					a = arr1[i];
					b = arr2[j];
					flag = true;
					break;
				}
				else if(flag!=true && temp!=0 && temp<min) {
					a = arr1[i];
					b = arr2[j];
					min = Math.abs(arr1[i])-Math.abs(arr2[j]);
				}
			}
		}
		System.out.println(a+" "+b);
	}
}
