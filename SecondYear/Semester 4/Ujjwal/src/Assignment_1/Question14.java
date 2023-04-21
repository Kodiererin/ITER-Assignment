package Assignment_1;
//	Write a recursive algorithm to solve the Tower of Hanoi problem.
public class Question14 {
	public static void main(String[] args) {
		towerOfHanoi('A', 'B', 'C', 4);
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
