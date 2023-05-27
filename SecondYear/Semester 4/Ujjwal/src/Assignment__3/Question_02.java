//	Given an array containing 0s, 1s and 2s. Write an algorithms to sort array
//	so that 0s come first followed by 1s and then 2s in the end.

package Assignment__3;
public class Question_02 {
	public static void main(String[] args) {
		int[] arr = {0,1,0,0,1,1,2,1,1,0,1,2,1 ,2};
		int[] arr2 = swapZeroOneTwo(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
//		0 0 1 0 1 0 2 1 2 2 0 1 2 0
	public static int[] swapZeroOneTwo(int[] arr) {
		int i=0;
		int j=0;
		int a = 0;
		int b = 0;
		while(i!=j) {
			if(arr[i]==0) i++;
			if(arr[j]==2) j--;
			else {
				a = i;
				while(arr[a]!=0) a++;
				swap(arr , i , a-1);
				i++;
				b = i;
				while(arr[b]!=0) b--;
				swap(arr,j,b+1);
				j--;				
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
