import java.util.*;
public class A5Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that want the factorial of");
			int num = sc.nextInt();
		int product = 1;
		if(num>0)
		{
			for(int i=1 ; i<=num ; i++)
			{
				product = i*product;
			}
		}
		System.out.println("Factorial of "+num+" is "+product);
	}
}