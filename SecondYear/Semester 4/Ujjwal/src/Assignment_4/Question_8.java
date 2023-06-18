package Assignment_4;

//	Given an array in which all the elements appear even number of times
//	except two, which appear odd number of times. Find the elements which
//	appear odd number of times in O(n) time complexity and O(1) space
//	complexity.

public class Question_8 {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,2,2,3,3,3,3,4,4,4,5};
		findNumber(arr);
	}
	public static void findNumber(int[] arr) {
		int ctr=1;
		for(int i=0 ; i<arr.length-1 ; ) {
//			System.out.println(arr[i]^arr[i+1]);
			if((arr[i] ^ arr[i+1])==0) {
				ctr++;
				i++;
			}else {
				if(ctr%2!=0) {
					System.out.println("Element found "+arr[i]);
					break;
				}else {
					i++;
					ctr=1;
				}
			}
		}
	}
}
