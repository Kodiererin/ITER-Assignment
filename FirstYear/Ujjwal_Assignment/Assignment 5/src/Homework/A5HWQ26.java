package Homework;
import java.util.Scanner;
public class A5HWQ26 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number that you want to check ");
		int n=sc.nextInt();
		int sum = 0;
		for(int i=1 ; i<n ; i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
//				System.out.println(i);
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect Number "+n);
		}
		else
			System.out.println("Not A Perfect Number ");

	}
}
