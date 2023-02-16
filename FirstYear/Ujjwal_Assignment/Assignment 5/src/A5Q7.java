//Write a java program to compute the sum of the first n terms (n>=1) of the series. 
//S=1-3+5-7+9- ……
import java.util.*;
class A5Q7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of terms");
			int n = sc.nextInt();
			int i=1; 
			int sum = 0;
			int ctr = 0;
		do
		{
			ctr = i + 2;
			if(i%2 == 0)
			{
				ctr = ctr*(-1);
			}
			sum = ctr + sum;			
			i++;
		}while(i<=n);
		System.out.println("The sum of the Numbers are = "+sum);
	}}