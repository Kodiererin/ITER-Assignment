//	WAP Given an array of n element print the duplicate element element present in it.

package April_19;

public class d_duplicateElementPrint {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,3,4,5};
		duplicateElement(arr);
	}
	public static void duplicateElement(int[] arr) {
		java.util.Hashtable<Integer, Integer> hTable = new java.util.Hashtable<Integer, Integer>();
		for(int i=0 ; i<arr.length ; i++){
			if(hTable.containsKey(arr[i])) {
				hTable.put(arr[i], hTable.get(arr[i])+1);
			}
			else {
				hTable.put(arr[i], 1);
			}
		}
//		System.out.println(hTable);
//		The duplicate elements are
		System.out.println("The Duplicate Elements are");
		for(int i=0 ; i<hTable.size() ; i++) {
			if(hTable.containsKey(i)) {
				if(hTable.get(i)>1) {
					System.out.print(i+" ");
				}
			}
		}
	}
}
