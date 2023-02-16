import java.util.*;
class A6Q5
{
	static void isPrime(int x , int y)
	{
		if(y>=x)
		{
//			System.out.println("The Number is Prime ");
			System.out.print(x+" ");
			return;
		}
		if(y<x)
		{
			if(x%y==0)
			{
//				System.out.println("The Number is Not Prime");
				return;
			}
			else
			{
				isPrime(x,y+1);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number that you want to check ");
//			int x = sc.nextInt();
//		isPrime(x,2);
		int ctr = 0;
		for(int i =1 ; i<=1000 ; i++)
		{
			ctr++;
			isPrime(i,2);
			if(ctr >=10)
			{
				System.out.println();
				ctr = 0;
			}
			
		}
	}
}