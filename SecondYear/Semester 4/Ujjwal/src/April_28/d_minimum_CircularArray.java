package April_28;

//	Minimum Circular Difference in the Circular Array.
//	Find the Difference between the Adjacent element
//	3,4,5,1,2
//	3-2,4-5,5-1,2-3,3-3				
public class d_minimum_CircularArray {
	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3};
		compute(arr);
	}
	public static void compute(int[] arr) {
		for(int i=0 ;  i<arr.length ; i++) {
			System.out.println(Math.abs(arr[i]-arr[(i+1)%arr.length]));
		}
	}
}
