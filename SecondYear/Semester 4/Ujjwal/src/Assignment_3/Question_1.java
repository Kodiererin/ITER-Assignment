package Assignment_3;

public class Question_1 {
	public static void main(String[] args) {
		int[] arr = {1,1,1,0,0,1,1,0,0,1,1,1};
		int[] arr2 = compute(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
//	1 0 1 1 1 1 0 0 0 0 1 0 1 0 0 0 0 1 1
	public static int[] compute(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i!=j) {
			if(arr[i]==1) {
				while(arr[j]!=0) {
					j--;
				}
				swap(arr ,i,j);
			}else {
				i++;
			}
		}
		return arr;
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
