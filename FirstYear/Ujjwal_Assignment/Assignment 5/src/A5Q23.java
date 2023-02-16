//Write a java program called PrimeCounter that takes a command line argument N and finds the 
//number of primes less than or equal to N. 
import java.util.*;
public class A5Q23 
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int count = 0;
		System.out.println("The Prime Numbers Less than "+x);
		for(int i=1 ; i<=x ; i++)
		{
			for(int j=1 ; j<=x ; j++)
			{
				if(i%j==0)
				count++;
			}
			if(count<=2)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
	}
}