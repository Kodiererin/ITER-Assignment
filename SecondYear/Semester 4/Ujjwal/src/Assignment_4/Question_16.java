package Assignment_4;
//	 Given an array of integers, you need to find a triplet whose sum equal to
//	given value.
public class Question_16 {
	public static void main(String[] args) {
		int[] arr = {2,3,1,-1,-3,4,2,90,8};
		int value = 5;
		compute(arr, value);
	}
	public static void compute(int[] arr , int value) {
		int flag=0;
//		Assuming that The triplets must not be in the sequence
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				for(int k = j ; k<arr.length ; k++) {
					if(arr[i]+arr[j]+arr[k]==value) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						flag=1;break;
					}
				}
				if(flag==1) break;
			}
			if(flag==1) break;
		}
	}
}
