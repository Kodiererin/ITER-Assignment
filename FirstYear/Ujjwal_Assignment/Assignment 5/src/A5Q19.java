//Write a java program that puts the binary representation of a positive integer N into a String s.
// break statement use nhi krna h!
import java.util.*;
public class A5Q19 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number =");
		int x = sc.nextInt();
		System.out.println("The number is "+x);
		int a , b , z ;
		int d = 0;
		double m = 0.0;
		String add = "";
		do
		{
			a = x/2;
			b = x%2;
			add = add+b;
			System.out.print(add+"");
			x = a;
			d = a;
		}while(d !=0);
	}
}
