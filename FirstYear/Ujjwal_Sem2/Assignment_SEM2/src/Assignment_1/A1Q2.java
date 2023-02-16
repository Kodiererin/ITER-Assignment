package Assignment_1;

import java.util.Scanner;

public class A1Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Positive Number Greater than 2");
		int x = sc.nextInt();
		sc.close();
		if (x > 2) {
			int ctr = 0;
			do {
				x = x / 2;
				ctr++;
			} while (x >= 2);
			System.out.println("Number of Times = " + ctr);
		} else {
			System.out.println("Enter A Positive Number That is greater than 2");
		}
	}
}
