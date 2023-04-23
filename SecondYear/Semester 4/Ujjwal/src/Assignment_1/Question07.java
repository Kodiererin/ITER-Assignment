package Assignment_1;
//	Given an array, write a program to arrange its elements in waveform
//	such that odd elements are lesser than its neighboring even elements.
public class Question07 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		int[] arr2 = waveForm2(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] waveForm2(int[] arr) {
		for(int i=1 ; i<arr.length-1 ; i++) {
			if(i%2==0) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
}
