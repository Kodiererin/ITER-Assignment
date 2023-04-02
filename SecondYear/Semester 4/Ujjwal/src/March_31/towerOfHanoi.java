package March_31;
//	Tower of Hanoi Problem
//	Transfer the Disc from Smaller to Larger.
public class towerOfHanoi {
	public static void main(String[] args) {
		towerOfHanoi('A', 'B', 'C', 15);
	}
	public static void towerOfHanoi(char A , char B , char C , int n) {
		if(n<=0) {
			System.out.println(A+" "+B+" "+C);
			return;
		}
		towerOfHanoi(A, C, B , n-1);
		towerOfHanoi(B, A, C , n-1);
	}
}
