package Assignment_4;

public class Question_15 {
//	Given an array of integers, you need to find a triplet whose sum 0
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,-1,-3,-4,-5,-6,-1};
		compute(arr);
	}
	public static void compute(int[] arr) {
		int flag=0;
		int a;int b;int c;
		a = b = c = 0;
		for(int i=0 ; i<arr.length-2 ; i++) {
			if((arr[i]+arr[i+1]+arr[i+2])==0) {
				a = arr[i];
				b = arr[i+1];
				c = arr[i+2];
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Element Not Found");
		else
			System.out.println(a+" "+b+" "+c);
	}
}
