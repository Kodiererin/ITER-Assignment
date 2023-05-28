package Assignment_3;
//Given an array containing 0s, 1s and 2s. Write an algorithms to sort array
//so that 0s come first followed by 1s and then 2s in the end.
public class Question_2 {
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1,0,0,0,1,0,1,0,1};
		int[] arr2 = compute(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] compute(int[] arr) {
		int i=0;
		int j=0;
		int k=arr.length-1;
		while(j<=k) {
			if(arr[j]==0) {
				while(arr[i]==0)
					i++;
				swap(arr,i,j);
			}
			else {
				while(arr[k]==2)
					k--;
				swap(arr,j,k);
			}
			j++;
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
