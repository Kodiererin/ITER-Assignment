package Assignment_1;

import java.util.Scanner;

public class A1Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a + b == c || a == b - c || a * b == c) {
			System.out.println("Correct Arithmetic Formula");
		} else {
			System.out.println("Not A correct Arithmetic Formula");
		}
	}
}
