package March_29;

public class mergeSortedArray {
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,5,6,7,8};
		int[] arr2 = {1,2,4,5,6,7,9};
		int[] arr3 = getSorted(arr1,arr2);
		for(int i=0 ; i<arr3.length ; i++) {
//			System.out.println(arr3[i]);
		}
		int[] test1 = new int[arr1.length+1];
		int[] test2 = new int[arr2.length+1];
		for(int i=0 ; i<arr1.length ; i++) {
			test1[i] = arr1[i];
		}
		test1[arr1.length] = Integer.MAX_VALUE;
		
		for(int i=0 ; i<arr2.length ; i++) {
			test2[i] = arr2[i];
		}
		test1[arr1.length] = Integer.MAX_VALUE;
		test2[arr2.length] = Integer.MAX_VALUE;
		
		
		int[] arr4 = combineArray(test1,test2);
		for(int i=0 ; i<arr4.length ; i++) {
			System.out.println(arr4[i]);
		}
	}
	
//	Using Infinity
	public static int[] combineArray(int[] test1 , int[] test2) {
		int[] arr3 = new int[test1.length+test2.length];
		int a=0;
		int b=0;
		for(int i=0 ; i<arr3.length ;i++) {
			if(test1[a]<test2[b]) {
				arr3[i] = test1[a];a++;
				
			}
			else {
				arr3[i] = test2[b] ;  b++;			
			}
		}
		return arr3;
	}
	
//	My Method
	
	public static int[] getSorted(int[] arr1 , int[] arr2)
	{
		int[] arr3 = new int[arr1.length + arr2.length];
		int min = Math.min(arr1.length, arr2.length);
		int i=0;
		int a=0;
		int b=0;
		for( ; i<min ; i++) {
			if(arr1[i]<=arr2[i]) {
				arr3[i] = arr1[a];
				a++;
			}
			else {
				arr3[i]= arr2[b];
				b++;
			}
		}
		i-=1;
		if(i<arr1.length && i>=arr2.length) {
			for(int j=i ; j<arr1.length ; i++) {
				arr3[i] = arr1[a];
			}
		} 
		if(i<arr2.length && i>=arr1.length) {
			for(int j=i ; j<arr1.length ; i++) {
				arr3[i] = arr2[b];
			}
		} 
		else {
			return arr3;
		}
		return arr3;
	}
}
