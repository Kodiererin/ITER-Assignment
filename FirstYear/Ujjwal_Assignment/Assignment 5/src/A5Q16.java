import java.util.*;
class A5Q16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int x= sc.nextInt();
		int y = 0;
		int z = 0;
		for(int i=1 ; i<=x ; i++)
		{
			y = x/10;
			z = x%10;
			x = y;
			System.out.print(z+"");
			if(x==0)
			{
				break;
			}
			
		}
	}
}
