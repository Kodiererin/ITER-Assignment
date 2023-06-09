package Assignment_4;

public class Question_7 {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,2,2,2,3,3,3,3,3,3};
		System.out.println(compute(arr , 0 , arr.length-1));
	}
	static int compute(int[] arr , int i , int  j) {
		if(i==j) {
			return arr[i];
		}
		else {
			int mid = (i+j)/2;
			int left = compute(arr, i, mid);
			int right = compute(arr, mid+1, j);
			return left==right?left:0;
		}
	}
}
