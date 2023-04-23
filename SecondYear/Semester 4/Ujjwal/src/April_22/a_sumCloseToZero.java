package April_22;
//	Given a List of Integers bothh +ve and -Ve, find two pair where sum is close to 0.
public class a_sumCloseToZero {
	public static void main(String[] args) {
		int[] arr = {-1,2,3,1,4,-5};
//		compute(arr);
		reduceTime(arr);
	}
	public static void compute(int[] arr) {
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		boolean flag = false;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				int temp = Math.abs(arr[i])-Math.abs(arr[j]);
				if(temp==0) {
					a = arr[i];
					b = arr[j];
					flag = true;
					break;
				}
				else if(flag!=true && temp!=0 && temp<min) {
					a = arr[i];
					b = arr[j];
					min = Math.abs(arr[i])-Math.abs(arr[j]);
				}
			}
		}
		System.out.println(a+" "+b);
	}
	public static void reduceTime(int[] arr) {
		int a = 0;
		int b = 0;
		boolean flag = false;
		java.util.Arrays.sort(arr);
		for(int i=0 ; i<arr.length-1 ; i++) {
			int sum = Math.abs(arr[i])-Math.abs(arr[i+1]);
			int mySum = Integer.MAX_VALUE;
			if(sum==0) {
				System.out.println(arr[i]+" "+arr[i+1]);
				flag = true;
				break;
			}
			else {
				if(sum<mySum) {
					a = arr[i];
					b = arr[i+1];
					mySum = sum;
				}
			}
		}
		if(flag==false) {
			System.out.println(a+" "+b);
		}
	}
}
