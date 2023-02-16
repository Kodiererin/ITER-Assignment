//	Write a java program to print the sum of all even numbers and the product of all odd numbers from 1 to N. Where,
//	N is the input to the program.
//	For input, N = 10
//	Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
//	Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945
import java.util.*;	
public class A4Q5 {

	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
			int x = sc.nextInt();
		int i=1;
		int sum = 0;
		int product = 1;
		do
		{
			if(i%2==0)
			{
				sum = sum+i;
			}
			else
			{
				product = product*i;
			}
			i++;
		}while(i<=x);
		System.out.println("The sum of the even numbers = "+sum);
		System.out.print("The product of the odd numbers = "+product);
	}

}
