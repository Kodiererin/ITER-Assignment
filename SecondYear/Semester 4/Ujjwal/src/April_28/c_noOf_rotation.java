package April_28;

public class c_noOf_rotation {
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};		//	Test Case Passed!
//		int[] arr = {5,1,2,3,4};		//	Test Case Passed!
		int[] arr = {4,5,1,2,3};		//  Test Case Passed!
//		System.out.println(findIndex(arr, 0, arr.length));
		System.out.print("No of Times Array was rotated is ");
		System.out.println((((findIndex(arr, 0, arr.length)+1)%(arr.length))));
	}
	public static int findIndex(int[] arr , int i, int j) {
		if(i<j) {
			int mid = (i+j)/2;
			if((mid+1>=arr.length && arr[mid]>arr[mid-1]) || ((mid-1)<0 && arr[mid]>arr[mid+1]) || (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]))
				return mid;
			if(arr[mid]>arr[i]) {
				return findIndex(arr, mid, j);
			}
			else if(arr[mid]<arr[i]) {
				return findIndex(arr, i,mid);
			}
		}
		return -1;
	}
}
