package Assignment_4;

public class Question5 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7,8,9};
		compute(arr, 0, arr.length);
	}
	static void compute(int[]arr , int i , int j) {
		int mid = (i+j)/2;
		if(mid+1<arr.length &&  arr[mid]+1==arr[mid+1]) {
			if(i!=j) {
				compute(arr, i, mid);
				compute(arr, mid+1, j);
			}
		}else {
			System.out.println(arr[mid]+1);
			return;
		}
	}
}
