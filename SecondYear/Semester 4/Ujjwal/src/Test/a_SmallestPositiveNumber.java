package Test;

public class a_SmallestPositiveNumber {
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,10,9,19};
		method1(arr);
		method2(arr);
	}
//	Using Collection Framework
	public static void method1(int [] arr) {
		java.util.Arrays.sort(arr);
		int i = 0;
		int m = 0;
		while(m<arr.length) {
			if(arr[m] != i) {
				System.out.println("Smallest Positive Number is "+i);
				break;
			}else {
				m++;
				i++;
			}
		}
	}
//	Without Using Collection Framework
	public static void method2(int[] arr) {
		for(int i=0 ; i<=arr.length ; i++) {
			int found = 0;
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[j]==i)
					found=1; break;
			}
			if(found==0)
				System.out.println("Smallest Positive Number is "+i); break;
		}
	}
}
