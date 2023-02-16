package Jan14;

import java.util.Scanner;
//	Create a 1d Array, put some element and handle array index out of bound exception
public class theException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Testing Exceptions");
		int[] arr = new int[2];
		try {
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] =sc.nextInt();
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(java.util.InputMismatchException o) {
			System.out.println(o);
		}
	}
}
