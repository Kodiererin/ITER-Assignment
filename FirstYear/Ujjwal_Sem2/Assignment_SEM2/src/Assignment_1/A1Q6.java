package Assignment_1;

import java.util.Scanner;

public class A1Q6 {
	static void compute(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
//			System.out.println(arr[i]);
		}
		System.out.println("The Maximum Number is " + arr[arr.length - 1]);
		System.out.println("The Minimum Number is " + arr[0]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter The Elements in the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		compute(arr);
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = (int) Math.max(max, arr[i]);
			min = (int) Math.min(min, arr[i]);
		}
		System.out.println("The Maximum Number is " + max);
		System.out.println("The Minimum Number is " + min);

		sc.close();
	}
}