package a_Important;

public class c_minimumSWAP {
	public static void main(String[] args) {
		minimumSwap();
	}
//	WAP to find minimum swap required to bring all values less than a given value 
//	from left of the array.
	public static void minimumSwap() {
		int [] arr = {10,20,2,30,8,6,40,5};
		int k = 9;
		int i=0;
		
		int rester=0;
		int pointer=0; 
		
		int swap=0;
		
		while(i<arr.length) {
			if(arr[i]<k) {
				int temp = arr[i];
				arr[i] = arr[rester];
				arr[rester] = temp;
				rester++;
				i++;
				
				swap++;
			}
			else {
				i++;
			}
		}
		
		for(int j=0 ; j<arr.length ; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("Total Swaps Occured is "+swap);
	}
}
