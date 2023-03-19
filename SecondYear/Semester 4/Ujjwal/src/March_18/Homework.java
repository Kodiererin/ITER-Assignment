package March_18;

public class Homework {
	public static void star(int i , int j , int n) {
		if(j<n) {
			if(i<j) {
				System.out.print(" * ");
				star(i+1,j,n);
			}
			else {
				System.out.println();
				star(0,j+1,n);
			}
		}
	}
	public static void fibonacciSeries(int i , int j , int n) {
		if(i<n) {
			System.out.print(i);
			fibonacciSeries(i, j+1 , n);
		}
		else {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		star(0,0,5);
		fibonacciSeries(0, 1 , 5);
	}
}
