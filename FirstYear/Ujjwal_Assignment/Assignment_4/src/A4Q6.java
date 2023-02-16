//	Write a program to print the multiplication table of a number entered by the user.
//	Enter a number for which you want to find the multiplication table: 8
//	8 x 1 = 8
//	8 x 2 = 16
//	8 x 3 = 24
//	8 x 4 = 32
//	8 x 5 = 40
//	8 x 6 = 42
//	8 x 7 = 56
//	8 x 8 = 64
//	8 x 9 = 72
//	8 x 10 = 80
import java.util.*;
public class A4Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number you want the Multiple of = ");
			int x = sc.nextInt();
		for(int i=1 ; i<11 ; i++)
		{
			int product = i*x;
			System.out.println(x+" x "+i+" = "+product);
		}
		
	}

}
