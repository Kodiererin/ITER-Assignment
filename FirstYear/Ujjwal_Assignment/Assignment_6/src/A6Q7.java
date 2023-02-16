import java.util.*;
public class A6Q7 
{
	static boolean checkPrime(int x , int y)
	{
		if(y>=x)
		{
			return true;
		}
		if(x%)
		{
			return false;
		}
		else
		{
			checkPrime(x,y+1);
		}
	}
		
	public static void main(String[] args)
	{
		System.out.println(checkPrime(11,2));
	}
}

