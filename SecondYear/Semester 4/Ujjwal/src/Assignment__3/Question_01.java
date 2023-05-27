package Assignment__3;
//	Given an array containing 0s and 1s. Write an algorithms to sort array
//	so that 0s come first followed by 1s. Also find the minimum number of
//	swaps required to sort the array.
public class Question_01 {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,0,0,1,0,0,1,1,1,1};
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int[] arr2 = swapOneZero(arr);
		for(int i=arr2.length-1 ; i>0; i--) {
			System.out.print(arr2[i]+" ");
		}
	}
	public static int[] swapOneZero(int[] arr) {
		int i=0 ;
		int j=0 ;
		int ctr=0;
		while(j<arr.length && i<arr.length) {
			for(int a = i ; a<arr.length ; a++) {
				if(arr[a]==0)
				{
					i = a;
					break;
				}
			}
			for(int b = j ; b<arr.length ; b++) {
				if(arr[b]==1)
				{
					j = b;
					break;
				}
			}
			if(arr[i]==0 && arr[j]==1) {
				swap(arr,j,i);
				ctr++;
			}
			i++;
			j++;
		}
		System.out.println("Total Swapping Done is "+ctr);
		return arr;
	}
	public static int[] swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
