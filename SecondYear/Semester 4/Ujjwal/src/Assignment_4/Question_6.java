package Assignment_4;
//	Q6. Given an array, find the maximum and minimum value in the array and
//	also find the values in range minimum and maximum that are absent in
//	the array.
public class Question_6 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,9,5,6,7};
		int i = findMin(arr , 0 , arr.length-1);
		int j = findMax(arr , 0 , arr.length-1);
		
		for(int a=0 ; a<arr.length ; a++) {
			if(arr[a]==i) { 
				int m = a;
				while(arr[m]!=j) {
					if(arr[m]+1!=arr[m+1]) {
						System.out.println(arr[m]+1);
					}
					m++;
				}
			}
		}
	}
	static int findMin(int[] arr , int i , int j) {
		if(i==j)
			return arr[i];
		else {
			int mid = (i+j)/2;
			int leftMin = findMin(arr, i, mid);
			int rightMin = findMin(arr, mid+1, j);
			return Math.min(leftMin, rightMin);
		}
	}
	static int findMax(int[] arr , int i , int j) {
		if(i==j)
			return arr[i];
		else {
			int mid = (i+j)/2;
			int leftMin = findMax(arr, i, mid);
			int rightMin = findMax(arr, mid+1, j);
			return Math.max(leftMin, rightMin);
		}
	}
}	
