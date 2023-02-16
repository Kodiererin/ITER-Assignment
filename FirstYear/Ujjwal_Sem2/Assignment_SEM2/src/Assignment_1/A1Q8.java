package Assignment_1;

import java.util.Scanner;

//	Write a Java program that takes two arrays a and b of length n storing int values, and returns 
//	the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], 
//	for i = 0, . . . , n − 1
public class A1Q8
{
	static int[] compute(int[]a , int[]b)
	{
		int[] c = new int[a.length];
		for(int i=0 ; i<c.length ; i++)
		{
			c[i] = a[i]*b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Kem Cho Ujjwal Mojame Ki Nhi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array");
		int[] a = new int[sc.nextInt()];
		int[] b = new int[a.length];
		System.out.println("Enter The Elements in the Array");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Elements in the Second Array");
		for(int j=0 ; j<b.length ; j++)
		{
			b[j] = sc.nextInt();
		}
//		preparing for dot product
		int c[] = new int[a.length];
		c	= compute(a,b);
		for(int k=0; k<a.length ; k++)
		{
			System.out.println(c[k]);
		}
		sc.close();
	}
}