// code theek kaam kr rha h lekin ye 797 me ruk jaa rha h aisa kyu??????/

import java.util.*; // mainley palindrome sirf 1,2,3 digits ke liye hi check krega
public class A6Q6 
{
	static boolean checkPalindrome(int x)
	{
		String tempx = x+"";
		int xlen = tempx.length();
			int shivam = x%10;
			int saurabh = (x/(int)Math.pow(10, xlen-1));
		if(shivam == saurabh)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void pprime(int initial , int counter , int limit)
	{
		if(initial>=limit)
		{
			return;
		}
		if(initial<=limit)
		{
			if(checkPalindrome(initial)	!= true)
			{
				pprime(initial+1,2,limit);
			}
			if(counter>=initial)
			{
				System.out.print(initial+" ");
				pprime(initial+1,2,limit);
			}
			if(counter<initial)
			{
				if(initial%counter==0)
				{
					pprime(initial+1,2,limit);
				}
				else
				{
					pprime(initial,counter+1,limit);
				}
			}
		}
	}
	public static void main(String[] args)
	{
//		System.out.println(checkPalindrome(9));
		pprime(1,2,1000);
	}
}
