package March_24;

public class maxTominFORM {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = revrerseSol2(arr);
//		for(int i=0 ; i<arr2.length ; i++) {
//			System.out.println(arr2[i]);
//		}
		int[] arr3 = revrerseOptimized(arr);
		for(int i=0 ; i<arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
	}
//	Given a sorted array in ascending to descending
//	rearrange to max-min form

//	Check this solution.
	public static int[] revrerseOptimized(int[] arr) {
//		Optimised Solution
		int a=0;
		int b = arr.length;
		for(int i=0 ; i<(a+b)/2 ; i++) {
			for(int j=i ; j<(a+b/2) ; j++) {
				int temp = arr[j];
				arr[j] = arr[arr.length-1-j];
				arr[arr.length-1-j] = temp;
			}
			a++;
			show(arr);
		}
		
		return arr;
	}
	public static void show(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static int[] revrerseSol2(int[] arr) {
		int i=0;
		int k=0;
		int j=arr.length-1;
		int[] arr2 = new int[arr.length];
		while(i<arr.length) {
			if(i%2==0) {
				arr2[i] = arr[j];
				j--;
				i++;
			}
			else {
				arr2[i] = arr[k];
				i++;
				k++;
			}
		}
		return arr2;
	}
	
}