package April_19;

public class a_Reduction {
	public static int[] sort(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void reduce(int[] arr) {
		int ctr= 0;
		arr = sort(arr);
		int small = arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i]-=small;
			if(arr[i]<=0) {
				ctr++;
			}
			if(arr[i]>0) {
				System.out.print(arr[i]+",");
			}
		}
		System.out.println();
		System.out.println("The Number of elements reduced : "+ctr);
	}
	
	public static void display(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void reduceNew(int[] arr) {
		int small=arr[0];
		int ctr=0;
		arr = sort(arr);
		for(int i=1 ;i<arr.length-1 ; i++) {
			arr [i-1] = arr[i-1]-small;
			if(arr[i-1]<=0) {
				small=arr[i];
				display(arr);
//				System.out.println(small+" small ");
				ctr++;
			}
		}
		System.out.println(ctr);
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,1,1,2,3,5};
		int[] arr2 = {7,5,8,2,4,5};
//		reduce(arr2);
		reduceNew(arr);
	}
}
