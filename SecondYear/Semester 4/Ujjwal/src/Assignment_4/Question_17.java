package Assignment_4;

//	given an array of positive integers representing edges of triangles. Find the
//	number of triangles that can be formed from these elements representing
//	sides of triangles. For a triangle sum of two edges is always greater than
//	third edge
public class Question_17 {
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,5,35,6,7,8,9,5,68,};
		compute(arr);
	}
	public static void compute(int[] arr) {
		int ctr=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				for(int k=j ; k<arr.length ; k++) {
					if((arr[i]+arr[j])>arr[k])
						ctr++;
				}
			}
		}
		System.out.println("The number of Triangles can be formed is "+ctr);
	}
}
