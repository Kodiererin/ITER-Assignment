package Assignment_1;
//	Given an array of size N, containing elements from 0 to N-1. All values
//	from 0 to N-1 are present in array and if they are not there than -1 is
//	there to take place. 

//	Write a program to arrange values of the array so that value i is stored at arr[i]
public class Question08 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,9};
		int[] getArr = arrangeArray(arr);
		for(int i=0 ; i<getArr.length; i++) {
			System.out.println(getArr[i]);
		}
	}
	public static int[] arrangeArray(int[] arr) {
//		Assuming the Array is sorted.
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
		int m = 0;
		for(int i=0 ; i<arr[arr.length-1] && m<arr.length; i++) {
			if(i==arr[m]) {
				map.put(i,i);
				m++;
			}
			else {
				map.put(i, -1);
			}
		}
		int[] arr2 = new int[map.size()];
		for(int i=0 ; i<map.size(); i++) {
			arr2[i] = map.get(i);
		}
		return arr2;
	}
}
