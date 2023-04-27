package April_26;
//	Find Maxima in a Bitonic List.
//	A Bitonic list comprises of increasing sequence of list followed by a decreasing sequqnce of list
//	2,5,6,7,8,9,10,4,3,2
//	iska Output 10 hoga kyuki uske baad value decrease hote jaa rha h!.
public class d_MaximinixBitonicList {
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
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,9,10,4,3,2};
        nTime_Find(arr);
    }
}
