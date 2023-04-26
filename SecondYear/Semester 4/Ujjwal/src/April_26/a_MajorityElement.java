package April_26;

//	Given An Array, Find the Majority element which appear n/2 times.
//	Return 0 if in-case there is no majority element.

public class a_MajorityElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,3,1,1};
//		majorityElement(arr);
//		majorityElement2(arr);
//		majorityElement3(arr);
		majorityElement4(arr);
	}
//	Using HashMap
	public static void majorityElement(int[] arr) {
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
		for(int i=0 ; i<arr.length ; i++) {
			if(map.containsKey(arr[i])==false) {
				map.put(arr[i], 1);
			}
			else if(map.containsKey(arr[i])==true) {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		System.out.println(map);
//		Checking the Data
		int myFlag=0;
		for(int i=0 ; i<map.size() ; i++) {
			if(map.get(i)>(arr.length)/2)
				System.out.println("Majority Element Found "+i); myFlag=1;
		}
		if(myFlag==0) System.out.println("Majority Element Not Found");
	}
//	Do it in nLog(n)  time
	public static void majorityElement2(int[] arr) {
		java.util.Arrays.sort(arr);
		int ctr=1;
		int flag=0;
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(arr[i]==arr[i+1]) {
				ctr++;
				if(ctr>Math.floor(arr.length/2)) {
					System.out.println("Majority element Exist");
					System.out.println(arr[i]+" is the Majority Element");
					flag=1;
					break;
				}
			}
			else {
				ctr=1;
			}
		}
		
		if(flag==0) {
			System.out.println("The Majority Element Doesnot Exist");
		}
	}
//	Another Method
	public static void majorityElement3(int[] arr) {
		int flag=0;
		int ctr=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[i]==arr[j]) {
					ctr++;
				}
				if(ctr>arr.length/2) {
					System.out.println("Element Found "+arr[i]);
					flag=1;
					break;
				}
				if(flag==1)
					break;
			}
			if(flag==1)
				break;
		}
		if(flag==0) {
			System.out.println("Majority Element Doesnot Exist");
		}
	}
	
	public static void majorityElement4(int[] arr) {
		java.util.Arrays.sort(arr);
		int flag=0;
		for(int i=0 ; i<arr.length/2 ; i++) {
			if(arr[i]==arr[(arr.length/2)+i]) {
				System.out.println("Majority Element Found");
				flag=1;
			}
		}
		if(flag!=1) {
			System.out.println("Majority Element Not Found");
		}
	}

	
//	Checking the Array
	public static void display(int[] arr) {
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(arr[i]);
	}
}
