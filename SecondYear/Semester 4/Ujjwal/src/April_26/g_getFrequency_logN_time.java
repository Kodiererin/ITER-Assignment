package April_26;

public class g_getFrequency_logN_time {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,3,3,3,4,5,6,6,7,7,8,8,8,8,8};
		int element = 6;
		System.out.println("The Frequency of "+element+" is "+getFrequency(arr, element));
	}
	public static int getFrequency(int[] arr , int element) {
		System.out.println(getFirstOccurence(arr, 0, arr.length, element));
		System.out.println(getLastOccurence(arr, 0, arr.length, element));
		
		return Math.abs(getLastOccurence(arr, 0, arr.length, element) - getFirstOccurence(arr, 0, arr.length ,element) + 1);
	}
	public static int getFirstOccurence(int[] arr , int i , int j , int element) {
		if(i<=j) {
			int mid = (i+j)/2;
			if((mid==0 || arr[mid-1]<element) && arr[mid]==element) {
				return mid;
			}
			else if(element<=arr[mid]) {
				return getFirstOccurence(arr, i, mid-1, element);
			}
			else if (element>arr[mid]){
				return getFirstOccurence(arr, mid+1, j, element);
			}
		}
		return -1;
	}
	public static int getLastOccurence(int[] arr , int i , int j , int element) {
		if(i<=j) {
			int mid = (i+j)/2;
			if((mid==0 || arr[mid+1]>element) && arr[mid]==element) {
				return mid; 
			}
			else if(element<arr[mid]) {
				return getLastOccurence(arr, i, mid-1, element);
			}
			else if(element>=arr[mid]) {
				return getLastOccurence(arr, mid+1, j, element);
			}
		}
		return -1;
	}
	
}
