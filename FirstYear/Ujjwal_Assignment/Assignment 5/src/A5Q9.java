import java.util.*;
class A5Q9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
			int x = sc.nextInt();
			int y = sc.nextInt();
		double power = Math.pow(x, y);
		int factorial = 1;
		for(int i=1 ; i<=y ; i++)
		{
			factorial = factorial*i;
//			System.out.println(factorial);
		}
		System.out.println("The Result is "+(power/factorial));
	}
}