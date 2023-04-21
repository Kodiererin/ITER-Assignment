package April_21;
//	Given an array of Size N, the element in the array may be repeated. You need to find the sum of distinct elements present in the array.
//	If there is some repeated value repeated contionous you can add it one.
public class d_addDifferent {
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8};
		addDiffent(arr);
	}
	public static void addDiffent(int [] arr) {
		java.util.Hashtable<Integer, Integer> obj = new java.util.Hashtable();
		int sum = 0;
		for(int  i=0 ; i<arr.length ; i++) {
			obj.put(arr[i], arr[i]);
		}
		for(int i=0 ; i<obj.size() ; i++) {
			sum+=obj.get(i);
		}
		System.out.println(sum);
	}
}
