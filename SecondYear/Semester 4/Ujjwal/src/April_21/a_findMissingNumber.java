package April_21;
//	In a given list of n-1 elements which are in the range of 1-n
//	There are no Duplicates in the Array.
//	One number is missing find the missing number.
public class a_findMissingNumber {
	public static void main(String[] args) {
		int[] arr = {0,1,2,6,4,3};
//		searchNum(arr);
		XOROperator(arr);
	}
	public static void searchNum(int[] arr) {
		java.util.HashMap<Integer, Integer> obj = new java.util.HashMap();
		for(int i=0 ; i<arr.length ; i++) {
			obj.put(arr[i], 1);
		}
//		obj.containsValue(null);
		System.out.println("The Number Missing is ");
		for(int i=0 ; i<obj.size()+1 ; i++) {
			if(obj.containsKey(i)==false) {
				System.out.println(i);
			}
		}
	}
//	Using XOR Operator in BigOh(n) time
	public static void XOROperator(int[] arr) {
//		System.out.println(4^5);
		System.out.println("Printing Missing Value");
		arr = sort(arr);
		for(int i=1 ; i<arr.length ; i++) {
			int m = arr[i]^i;
			System.out.println(arr[i]+" ^ "+i+" =  "+m);
//			System.out.println(m);
		}
	}
	
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
}
