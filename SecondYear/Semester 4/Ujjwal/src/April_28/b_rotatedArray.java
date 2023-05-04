package April_28;
//	!! This is Important !!


//	It is like a circular Array. Where the Next Pointer of the last element is the First Element.
//	There is a Operator Modulus Operator.


//	Given a sorted List of S of n-integers. S is rotated unknown number of times.   		<- This is Important.
//	Find the Maximum value of the Array.....


//	i%n + 1			<- This is the Key Formula


//	Initially the array must be sorted.
//	Use Binary Search
public class b_rotatedArray {
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};			Test Case Passed!
//		int[] arr = {5,1,2,3,4};			Test Case Passed!
		int[] arr = {4,5,1,2,3};		//  Test Case Passed!
		System.out.println(compute(arr, 0, arr.length));
	}
	public static int compute(int[] arr , int i , int j) {
		if(i<j) {
			int mid = (i+j)/2;
			if((mid+1>=arr.length && arr[mid]>arr[mid-1]) || ((mid-1)<0 && arr[mid]>arr[mid+1]) || (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]))
				return arr[mid];
			if(arr[mid]>arr[i]) {
				return compute(arr, mid, j);
			}
			else if(arr[mid]<arr[i]) {
				return compute(arr, i,mid);
			}
		}
		return -1;
	}
}
