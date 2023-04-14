package April_14;

public class a_Arrange012 {
	public static void main(String[] args) {
		arrange();
	}
//	Arrange 0,1,2
	public static void arrange() {
//		int[] arr = {0,2,2,2,2,1,1,1,0,1,2,2,2,1,1,0,0,0};
		int[] arr = {0,2,2,1,2,1,2,1,0,2,0,0,0,2};
		int left = 0;
		int right = arr.length-1; 
		int i=0;
		while(i<right) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i] = arr[left];
				arr[left] = temp;
				left++;
				i++;
			}
			else if(arr[i]==2) {
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				right--;
			}
			else
			{
				i++;
			}

		}
		for(int j=0 ; j<arr.length ; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
