package April_19;
//	Check the code, it is incomplete

public class b_Union_Intersection {
	public static void main(String[] args) {
		int[] arr1 = {2,1,3,5,7};
		int[] arr2 = {1,5,8,9,2};
		
		union_intersection(arr1, arr2);
	}
	public static int[] sort(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void union_intersection(int[] arr1 , int[] arr2) {
		arr1 = sort(arr1);
//			display(arr1);
		arr2 = sort(arr2);
//			display(arr2);
			
		int[] union = new int[arr1.length+arr2.length];
		int[] intersection = new int[arr1.length + arr2.length];
		
		int unionPointer=0;
		int intersectionPointer=0;
		
		int a=0;
		
		int i=0;
		while(i<Math.min(arr1.length, arr2.length)) {
			if(arr1[i]==arr2[i]) {
				union[unionPointer] = arr1[i];
				intersection[intersectionPointer] = arr1[i];
				unionPointer++;
				intersectionPointer++;
			}
			else {
				a = i;
				if(arr1.length<arr2.length) {
					while(a<arr1.length && arr1[a]!=arr2[i]) {
						a++;
					}
					intersection[intersectionPointer] = arr1[a];
					union[unionPointer] = arr1[a];
					intersectionPointer++;
					unionPointer++;
				}
				else if(arr1.length>arr2.length) {
					while(a<arr2.length && arr1[i]!=arr2[a]) {
						a++;
					}
					intersection[intersectionPointer] = arr2[a];
					union[unionPointer] = arr2[a];
					intersectionPointer++;
					unionPointer++;
				}
			}
			i++;
		}
		
		
		if(i<arr1.length) {
			for(int z = i ; z<arr1.length ; z++) {
				union[unionPointer] = arr1[i];
				unionPointer++;
			}
		}
		else if(i<arr2.length) {
			for(int z = i ; z<arr2.length ; z++) {
				union[unionPointer] = arr2[i];
				unionPointer++;
			}
		}
		
		
		
//		Printing the Intersection and union Array
		System.out.println("Printing the Array");
		for(int j=0 ; j<intersection.length ; j++) {
			System.out.print(intersection[j]+" ");
		}
		System.out.println();
		for(int j=0 ; j<union.length ; j++) {
			System.out.print(union[j]+" ");
		}
		
		
	}
	
	
//	Displaying the Data.
	public static void display(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void unionIntersection(int[] arr1 , int[] arr2) {
		arr1 = sort(arr1);
		arr2 = sort(arr2);
		int[] union = new int[Math.max(arr1.length, arr2.length)];
		int[] intersetion = new int[Math.min(arr1.length, arr2.length)];
		
		int unionPointer=0;
		int intersectionPointter=0;
		
//		Setting Up 2 Pointers
		int pointer1=0;
		int pointer2=0;
		
		for(int i=0 ; i<Math.min(arr1.length, arr2.length) ; i++) {
			if(arr1[i]==arr2[i]){
				union[unionPointer] = arr1[i];
				intersetion[intersectionPointter] = arr1[i]; 
				pointer1++;
				pointer2++;
				
			}
//			Checking Intersection
			else if(arr1[i]!=arr2[i]) {
				int a = i;
				if(arr1.length>arr2.length) {
					while(a<arr2.length) {
						if(arr1[pointer1]==arr2[pointer2]) {
							
						}
					}
				}
			}
		}
	}
	
}
