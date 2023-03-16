package Jan14;

import java.util.Scanner;

//Write a program to create an array of Integer type read Integer in String format.
//Typecast it to integer and put it in the Array, handle arrayindexofbound and numberformat exception.

public class theException2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size ");
		int[] arr = new int[sc.nextInt()];
		for(int i=0 ; i<arr.length ; i++) {
			try {
				String num = sc.next();
				arr[i]= convert(num);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static int convert(String num) throws Exception {
		int x = 0;
		for(int i=0 ; i<num.length() ; i++) {
			if(num.charAt(i)=='.')
				throw new Exception("Enter The Integer");
			else {
				x = x+(int)num.charAt(i)*(int)Math.pow(10, num.length()-1-i);
			}
		}
		return x;
	}
}
