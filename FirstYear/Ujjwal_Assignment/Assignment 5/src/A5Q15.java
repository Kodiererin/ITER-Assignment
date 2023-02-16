import java.util.*;
public class A5Q15 
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Amount");
			double x = sc.nextInt();
		System.out.println("Enter The Rate");
			double y = sc.nextInt();
		System.out.println("Enter Time in Months");
			int z = sc.nextInt();
//		y = (y/100)/12;
		System.out.println(y);
		double amount = 0.0;
		for(int i=1 ; i<=z ; i++)
		{
			amount = x+(x*(y));
			x = amount;
		}
		System.out.println("The Amount in the savings Account after "+z+" months is "+amount);
	}
}
