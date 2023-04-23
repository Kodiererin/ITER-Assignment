package April_22;
//	Given an array of Integer find a triplet whose sum is 0
public class d_findTripLet {
	public static void main(String[] args) {
		int[] arr = {-1,2,3,-2,5,6};
//		display(arr);
		findTripLet(arr);
//		reduceTime(arr);
	}
	public static void findTripLet(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				for(int k = 0 ; k<j ; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						break;
					}
				}
			}
		}
	}
//	Trying to reduce the time
//	Check the code 
	public static void reduceTime(int[] arr) {
		System.out.println("Starting the Time");
		java.util.Arrays.sort(arr);
		int a = 0;
		int b = arr.length-1;
		int c = (a+b)/2;
		int sum = Integer.MIN_VALUE;
		while(a<b && c>b) {
			sum = arr[a]+arr[b]+arr[c];
			if(sum==0) {
				System.out.println(arr[a]+" "+arr[b]+" "+arr[c]);
			}
			else {
				a++;
				b--;
				c--;
			}
		}
		if(sum!=0) {
			while(a<b && b<c) {
				sum = arr[a]+arr[b]+arr[c];
				if(sum==0) {
					System.out.println(arr[a]+" "+arr[b]+" "+arr[c]);
				}
				else {
					a++;
					b++;
					c--;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void display(int[] arr) {
		java.util.Arrays.sort(arr);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
