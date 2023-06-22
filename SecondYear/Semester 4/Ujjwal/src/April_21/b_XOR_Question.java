//	Code Successful!


package April_21;
//	Given an array in which all elements are appear even number of time except one which present odd numbers
//	of time. Find the element which is present odd number of time using XOR.
public class b_XOR_Question {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,5,2,4,3,4};
//		presentOrNot(arr);
		checkDup(arr);
	}
	public static void presentOrNot(int[] arr) {
		System.out.println("Finding Odd Element using XOR");
		if(arr.length%2==0) {
			System.out.println("No Odd Number is Present");
		}
		else {
			boolean flag = false;
			for(int i=1 ; i<arr.length ; i=i+2) {
				int m = arr[i-1]^arr[i];
//				System.out.println(m);
				if(m!=0) {
					System.out.println(arr[i]);
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(arr[arr.length-1]);
			}
		}
	}
	
//	This is the main code.
	public static void  checkDup(int[] arr) {
		int found = 0;
		for(int i=1 ; i<arr.length ; i++) {
			int m = arr[i]^arr[i-1];
			System.out.println("This is m "+m);
//			System.out.println(m);
			if(m!=0) {
				found = arr[i];
			}
		}
		System.out.println("The number Found is "+found);
	}
}
