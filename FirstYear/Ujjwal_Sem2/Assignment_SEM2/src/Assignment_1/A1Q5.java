package Assignment_1;

import java.util.Scanner;

public class A1Q5 {
	static boolean isOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int num = sc.nextInt();
		sc.close();
		while (num >= 0) {
			num = num - 2;
			if (num == 1) {
				return true;
			}
			if (num == 0) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("The Number is Odd " + isOdd());
	}
}