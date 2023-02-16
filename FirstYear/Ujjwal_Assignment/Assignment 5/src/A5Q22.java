import java.util.*;
class A5Q22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int x = sc.nextInt();
		int count = 0;
		for(int i=1 ; i<=x ; i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("This is not a prime No");
		}
		else
		{
			System.out.println("This is A Prime No");
		}
	}
}