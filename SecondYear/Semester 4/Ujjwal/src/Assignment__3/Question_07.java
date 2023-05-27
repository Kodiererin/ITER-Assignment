package Assignment__3;
//	. Element left after reductions. Given an array of positive elements. You
//	need to perform reduction operation. In each reduction operation smallest
//	positive element value is picked and all the elements are subtracted by that
//	value. You need to print the number of elements left after each reduction
//	process.

public class Question_07 {
	public static void main(String[] args) {
		int[] arr = {1,2,1,1,3,4,4,2,2,1,1,3,4,5,6,8,9,10};
		reduceNumbers(arr);
	}
	public static void reduceNumbers(int[] arr) {
		java.util.Arrays.sort(arr);
		int min = arr[0];
		int ctr=1;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==min) {
				arr[i]-=min;
			}
			else {
//				System.out.println(arr[i]);
				printAfterReduction(arr);
				min = arr[i];
				i-=1;
				ctr++;
			}
		}
		System.out.println(ctr);
	}
	public static void printAfterReduction(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
