package Assignment_4;

public class Question_12 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,1,2,3};
		int[] arr2 = {1,2,-1,23,2};
		int value = 0;
		compute(arr1, arr2, value);
	}
	public static void compute(int[] arr1 , int[] arr2 , int value) {
		for(int i=0 ; i<arr1.length ; i++) {
			int flag=0;
			for(int j=0 ; j<arr2.length ; j++) {
				if(arr1[i]+arr2[j]==value) {
					System.out.println(arr1[i]+" "+arr2[j]);
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
	}
}
 
