package March_24;

public class findSmallestPositiveNo {
	public static void main(String[] args) {
		int[] arr = {3,10,5,4,1,11};
		System.out.println(minimumValue(arr));
	}
//	Without Sorting
	public static int minimumValue(int[] arr) {
		java.util.HashMap<Integer, Integer> obj = new java.util.HashMap<>();
		int num=0;
		for(int i=0 ; i<arr.length ; i++) {
			obj.put(i, arr[i]);
		}
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(obj.get(i)+1!=obj.get(i+1))
				num = obj.get(i);
		}
		return num+1;
	}
}