package April_22;

public class e_tripLet_to_Triangle {
	public static void main(String[] args) {
		int[] arr  = {2,5,3,2,6,7};
		findTripLet(arr);
	}
	public static void findTripLet(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				for(int k = 0 ; k<j ; k++) {
					if(arr[i]!=0 && arr[j]!=0 && arr[k]!=0 && arr[i]+arr[j]>arr[k]) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
}
