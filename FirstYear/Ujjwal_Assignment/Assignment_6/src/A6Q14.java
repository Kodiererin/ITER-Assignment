import java.util.*;
public class A6Q14 
{
	static boolean eight(String x)
	{
		if(x.length()>=8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static boolean digit(String x)
	{
		int ctr=0;
		if(eight(x)==true)
		{
			for(int i=0 ; i<x.length() ; i++)
			{
				if(x.charAt(i)>=65 && x.charAt(i)<=90 || x.charAt(i)>=48 && x.charAt(i)<=57 || x.charAt(i)>=97 && x.charAt(i)<=128 )
				{
					ctr++;
				}
			}
			if(ctr==x.length())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		if(eight(x)==false)
		{
			return false;
		}
		return false;
	}
	static boolean checkDigit(String x)
	{
		int ctr = 0;
		if(digit(x)==true)
		{
			for(int i=0 ; i<x.length() ; i++)
			{
				if(x.charAt(i)>=48 && x.charAt(i)<=57)
				{
					ctr++;
				}
			}
			if(ctr<2)
			{
				return false;
			}===
			else
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey! Hello Ujjwal Please Set your Password ");
		System.out.print("Password = ");
			String x = sc.nextLine();
		if(checkDigit(x)==true)
		{
			System.out.println("Great! your password has been set");
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}
}
