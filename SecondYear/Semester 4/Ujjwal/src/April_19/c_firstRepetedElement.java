package April_19;
//	Given a unsorted list of n element, find the first element which is repeated.
public class c_firstRepetedElement {
	public static void searchFirst (int[] arr){
		int first=0;
		int ctr =  0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				if(arr[i]==arr[j]) {
					first = arr[i];
					ctr++;
				}
			}
			if(ctr>1) {
				System.out.println(arr[i]);
				break;
			}
			else {
				ctr=0;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,5,3,5,20,3,7};
		searchFirst(arr);
	}
}
