package Assignment_1;
//	Write a recursive function to find the GCD of two numbers. Write the
//	recurrence of the function and solve it for a solution.
public class Question15 {
	public static void main(String[] args) {
		System.out.println(findGCD(45,87));
	}
	public static int findGCD(int x, int y) {
		if(y==0)
			return x;
		else
			return findGCD(y,x%y);
	}
}
