package April_26;

//	Same Question but Do it in Log(n) time
//	Many Test Cases are getting Failed.
//	Check the Test Cases.
public class b_MajorityElementShow {
	public static void main(String[] args) {
		int[] arr = {1,1,4,4,4,4,4,4};
		int[] arr2 = {1,2,3,4,5,5,5,5,5,5,5};
		System.out.println("Array Length is "+arr2.length);
		findMajorityBinarySEARCH(arr2, 0, arr2.length-1, arr2[arr2.length/2]);
//		findMajorityBinarySEARCH(arr, 0, arr.length-1, arr[arr.length/2]);
	}
	public static void findMajorityBinarySEARCH(int[] arr , int i , int j , int value) {
		System.out.println(i+" "+j+" "+value);
		if((i==j) && ((i-1)<0 || (j+1)>arr.length-1) && arr[i]==value)
			System.out.println("Element Found");
		else if((i!=j)) {
			if(value<=arr[(int)Math.floor((i+j)/2)]) {
				findMajorityBinarySEARCH(arr, 0, (int) Math.floor((i+j)/2), value);
			}
			else if(value>=arr[(int)Math.floor((i+j)/2)]){
				findMajorityBinarySEARCH(arr,(int) Math.floor((i+j)/2)+1, arr.length-1, value);
			}
		}
		else {
			System.out.println("Element Not Found");
		}
	}
}
