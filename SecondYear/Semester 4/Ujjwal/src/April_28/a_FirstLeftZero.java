package April_28;

public class a_FirstLeftZero {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,1};
//		int[] arr = {0,0,0,1,1,1};
		System.out.println(compute(arr, 0, arr.length, 1));
	}
	public static int compute(int[] arr , int i , int j , int element) {
		if(i<=j) {
			int mid = (i+j)/2;
			if((arr[mid]==1) && (mid-1<0 || (mid+1)>=arr.length || arr[mid-1]==0)  )
				return mid;
			if(element<=1) {
				return compute(arr,i,mid-1 , element);
			}
			else if(element>0) {
				return compute(arr, mid+1, j, element);
			}
		}
		return -1;
	}
}