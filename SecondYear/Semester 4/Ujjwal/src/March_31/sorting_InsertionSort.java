package March_31;

public class sorting_InsertionSort {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,11,22,31,9,87};
		int[] arr2 = insertionSort(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] insertionSort(int[] arr) {
		int i=1;
		while(i<arr.length) {
			int j=i-1;
			while(j>0 && arr[j]<arr[i]) {
				j--;
			}j+=1;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
		
		return arr;
	}
}