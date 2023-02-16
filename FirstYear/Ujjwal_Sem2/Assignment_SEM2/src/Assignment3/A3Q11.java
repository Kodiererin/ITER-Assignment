package Assignment3;

import java.util.Scanner;

//import java.util.Scanner;

public class A3Q11 
{
	public static void gcd(int x , int y)
	{
		if(y==0)
			System.out.println("The GCD is "+x);
		if(y!=0)
			gcd(y , x%y);
	}
	public static void main(String[] args) 
	{
		System.out.println("Finding GCD by using Recursion ");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter First Number ");
			int x = sc.nextInt();
		System.out.println("Enter Second Number ");
			int y = sc.nextInt();
//		A3Q11.gcd(1331, 1001);
		A3Q11.gcd(x, y);
	}
}