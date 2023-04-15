package March_29;

public class nextPathSum {
	public static void main(String[] args) {
		int[] arr1 = {12,13,18,20,22,26,70};
		int[] arr2 = {11,15,18,19,20,26,30,31};
		System.out.println(maxSum(arr1, arr2));
	}
	public static int maxSum(int[] arr1 , int[] arr2) {
		int sum1 = 0;
		int sum2 = 0;
		int finalSum=0;
		int a =0;
		int b=0;
		
		int[] path = new int[Math.max(arr1.length, arr2.length)];
		
		int c = Math.min(arr1.length, arr2.length);
		int i=0;
		for( ; i<c; i++) {
			if(arr1[i]!=arr2[i]) {
				path[i] = Math.max(arr1[i], arr2[i]);
				sum1+=arr1[i];
				sum2+=arr2[i];
				
			}
			else {
				finalSum = finalSum+arr1[i]+Math.max(sum1, sum2);
				path[i] = arr1[i];
				sum1=0;
				sum2=0;
			}
		}
		finalSum+=Math.max(sum1, sum2);
//		System.out.println(finalSum);
		// System.out.println(i);
//		As the I gets Updated so we have to decrement i
		if(arr1.length>arr2.length) {
			for( ; i<arr1.length ; i++)
				finalSum+=arr1[i];path[i] = arr1[i];
		}else {
			for( ; i<arr2.length ; i++) {
				finalSum+=arr2[i];path[i] = arr2[i];
			}	
		}
		
		for(int k=0 ; k<path.length ; k++) {
			System.out.println(path[k]);
		}
		
		return finalSum;
	}
}
