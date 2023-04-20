package April_19;
//	Write a program to remove the duplicate element from an array in O(nLog(n)) time.
//	Do the Code.

public class ee_removeDuplicateElement {
	public static void main(String[] args) {
		int[] arr = {1,2,11,3,3,4,5,1,2,11,3,3,3};
//		display(arr);
		removeDuplicate(arr);
	}
	public static void removeDuplicate(int[] arr) {
		arr = sort(arr);
		display(arr);
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i]==arr[i-1]) {
				int dup = arr[i-1];
				while(arr[i]!=dup) {
					i++;
				}
				int temp = dup;
				dup = arr[i];
				arr[i] = temp;
			}
		}
		display(arr);
	}
	
//	Sorting The Element
	public static int[] sort(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
//	Displaying the Data
//	Displaying the Data.
	public static void display(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
