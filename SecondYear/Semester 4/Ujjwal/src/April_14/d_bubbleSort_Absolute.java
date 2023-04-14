package April_14;

class Numbers{
	int myNumber;
	int absoluteNum;
	Numbers(int myNumber , int absoluteNum){
		this.myNumber = myNumber;
		this.absoluteNum= absoluteNum;
	}
}

public class d_bubbleSort_Absolute {
	public static void main(String[] args) {
		compute();
	}
	public static void compute() {
		int[] arr = {9,1,8,2,7,3,6,4,5};
		int k=5;
		
		Numbers[] num = new Numbers[9];
		
		for(int i=0 ; i<arr.length ; i++) {
			num[i] = new Numbers(arr[i], Math.abs(k-arr[i]));
		}
		
		
//		Getting started with Bubble Sort
		for(int i=0 ; i<num.length ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(num[i].absoluteNum>num[j].absoluteNum) {
					Numbers temp = num[i];
					num[i]= num[j];
					num[j]= temp;
				}
			}
		}
		
//		Displaying the Data
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(num[i].myNumber);
		}
	}
}
