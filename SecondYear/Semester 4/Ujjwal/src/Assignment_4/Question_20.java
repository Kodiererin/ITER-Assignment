package Assignment_4;

public class Question_20 {
	// Time Complexity in n time
    public static void nTime_Find(int[] arr){
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.print("BitIonic Element Found ");
                System.out.println(arr[i]);
                break;
            }
        }
    }
//    Doing with Binary Search
//    This is the Main Function.
    public static int BitonicSearch(int[] arr , int i , int j) {
    	int mid = (i+j)/2;
    	if(i==j)
    		return arr[i-1];
    	if(arr[mid]>arr[mid-1]) {
    		return BitonicSearch(arr, mid+1, j);
    	}
    	else {
    		return BitonicSearch(arr, i, mid-1);
    	}
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,9,10,4,3,2};
//        nTime_Find(arr);
        System.out.println(BitonicSearch(arr, 0, arr.length));
    }
}
