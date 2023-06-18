package Assignment_4;
//	. Given an array of n numbers, find two elements such that their sum is
//	equal to “value”


public class Question_11 {
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,4,5,6,7,8};
		int value = 4;
		findSum(arr, value);
	}
	public static void findSum(int[] arr , int value) {
		int flag=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				if(arr[i]+arr[j]==value) {
					System.out.println(arr[i]+" "+arr[j]);
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
	}
}
