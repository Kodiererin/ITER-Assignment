package Assignment_3;
//	Q8. Given two sorted arrays. Sort the elements of these arrays so that first
//	half of sorted elements will lie in first array and second half lies in second
//	array. Extra space allowed is O(1)

public class Question_8 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,5,6,10,13,15};
		int[] arr2 = {1,2,3,4,6,7,8,10,13,14,19,29,34}; 
		compute(arr1 , arr2);
	}
	public static void compute(int[] arr1 , int []arr2) {
//		Assuming the Arrays are Sorted
		int i=0;
		int j=0;
		int min = arr1.length>arr2.length?arr2.length:arr1.length;
		while(i<min && j<min) {
			if(arr1[i]>=arr2[j]) {
				swap(arr1, arr2, i, j);
				j++;
			}else {
				i++;
			}
		}
		
		for(i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(j=0 ; j<arr2.length ; j++) {
			System.out.print(arr2[j]+" ");
		}
	}
	public static void swap(int[] arr1 , int[] arr2 , int i , int j) {
		int temp = arr1[i];
		arr1[i] = arr2[j];
		arr2[j] = temp;
	}
}
