//Write a java program to generate and print the first n terms of the Fibonacci sequence where 
//n>=1. 
import java.util.*;
public class A5Q13 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Fibonacci Numbers Your need! ");
		int x = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int count  = 0;
		for(int i=0 ; i<=x ; i++)
		{
			System.out.print(a+" ");
//			sum = b+a;
//			b = a ;
//			a = sum;
			a = b+a;
			b = a-b;
		}
	}
}
